# Courses Manager

Este é o repositório oficial do projeto Courses Manager, uma aplicação desenvolvida para gerenciar cursos utilizando tecnologias modernas. Abaixo estão algumas informações importantes sobre o projeto.

## Tecnologias Utilizadas

- **Angular**: Utilizado para desenvolver o front end da aplicação, proporcionando uma experiência de usuário moderna e responsiva.

- **Java + Spring Boot**: Utilizados para desenvolver o back end da aplicação, fornecendo uma base robusta e escalável para a lógica de negócios.

- **PostgreSQL**: Escolhido como banco de dados para armazenar e gerenciar os dados da aplicação de maneira eficiente e confiável.

- **Docker**: Implementamos um container Docker para a aplicação, facilitando a implantação e garantindo consistência em diferentes ambientes.

## Funcionalidades

### Métodos CRUD

A aplicação oferece os métodos básicos de um CRUD (Create, Read, Update, Delete), todos operando de maneira eficaz:

- **GET (ALL)**: Recupera todos os cursos disponíveis na base de dados.

- **GET (BY ID)**: Recupera um curso específico com base em seu identificador.

- **POST**: Adiciona um novo curso à base de dados.

- **PUT**: Atualiza um curso existente com base em seu identificador.

- **DELETE**: Remove um curso específico da base de dados.

### Funcionalidades Adicionais

Além dos métodos CRUD, a aplicação também inclui funcionalidades adicionais:

- **Validações Funcionando**: Implementamos validações para garantir a integridade e consistência dos dados.

- **Paginação de Dados**: Para facilitar a navegação e a exibição eficiente de grandes conjuntos de dados, implementamos um sistema de paginação.

## Executando a Aplicação

Para executar a aplicação, siga as instruções abaixo:

1. Clone o repositório para sua máquina local.
2. Certifique-se de ter o Docker instalado.
3. Navegue até o diretório do projeto.
4. Execute o seguinte comando para construir e iniciar o container Docker:

```bash
docker-compose up
