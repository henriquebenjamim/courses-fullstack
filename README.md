# Projeto Fullstack de Gerenciamento de Cursos

Este é um projeto fullstack desenvolvido para gerenciamento de cursos, utilizando as seguintes tecnologias:

- Java 17
- Spring Boot 3
- Angular 17

## Visão Geral

O objetivo deste projeto é fornecer uma aplicação de gerenciamento para cursos, com foco no domínio de cursos e suas respectivas aulas. A aplicação oferece funcionalidades completas de CRUD (Create, Read, Update, Delete) para garantir um controle eficaz das informações.

## Estrutura do Projeto

O projeto está dividido em duas partes principais:

### Backend (Spring Boot)

O backend é desenvolvido em Java utilizando o framework Spring Boot 3. Ele inclui entidades para Curso e Aula, com endpoints CRUD correspondentes. A camada de persistência é implementada utilizando Spring Data JPA.

### Frontend (Angular)

O frontend é construído em Angular 17 e proporciona uma interface de usuário amigável para interagir com os cursos e suas aulas. As funcionalidades incluem listar, adicionar, editar e excluir cursos e aulas.

## Executando a Aplicação Localmente

### Pré-requisitos

- JDK 17
- Node.js e npm
- Banco de dados configurado (PostgreSQL)

### Backend (Spring Boot)

1. Navegue até o diretório do projeto Spring Boot.
2. Execute o comando: `./mvnw spring-boot:run`

### Frontend (Angular)

1. Navegue até o diretório do projeto Angular.
2. Execute o comando: `ng serve`

A aplicação estará disponível em `http://localhost:4200`.

## Integração

O frontend e o backend se comunicam para fornecer uma experiência de usuário integrada. Certifique-se de que ambos os serviços estejam em execução ao testar a aplicação localmente.