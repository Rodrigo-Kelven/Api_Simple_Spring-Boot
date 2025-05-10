# Simple API in Spring Boot

![Java](https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=ffffff)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)


Este repositório contém uma API simples construída utilizando o Spring Boot. O objetivo deste projeto é fornecer um ponto de partida básico para a construção de APIs RESTful com Spring Boot.
## Funcionalidades

- Exposição de endpoints RESTful.

- Operações simples de CRUD (Create, Read, Update, Delete). -> "**Implementação**"

- Conexão com o banco de dados (H2 por padrão). -> "**Implementação**"

- Validação simples de entrada de dados. -> "**Implementação**"

## Tecnologias Utilizadas

- Spring Boot - Framework para criação de aplicações Java.

- Spring Web - Para criação de APIs RESTful.

- Spring Data JPA - Para interação com banco de dados. -> "**Implementação**"

- H2 Database - Banco de dados em memória (pode ser substituído por outros bancos). -> "**Implementação**"

- Lombok - Para reduzir o boilerplate de código (se aplicável). -> "**Implementação**"

## Como Rodar o Projeto
### Pré-requisitos

#### Antes de rodar o projeto, certifique-se de ter as seguintes ferramentas instaladas:

- Java 11 ou superior.

- Gradle (ou Maven, se preferir).

## Passos

- ### 1 Clone este repositório:

      git clone https://github.com/Rodrigo-Kelven/Api_Simple_Spring-Boot
      cd Api_Simple_Spring-Boot/first-spring-app

- ### 2 Compile e execute o projeto com Gradle:
      chmod +x script.sh
      ./script.sh

### A API estará disponível em http://localhost:8080.

## Endpoints

- ## 1. GET /

- ### Retorna uma mensagem de saudação simples.

- ### Exemplo de resposta:

      {
        "message": "Hello World, esta é minha primeira API em Spring Boot."
      }

- ## 2. GET /seila

- ### Retorna uma mensagem de saudação simples.

- ### Exemplo de resposta:

      {
        "message": "Aprenda Java !!!"
      }

- ## 2. GET /hello

- ### Retorna uma mensagem de saudação simples.

- ### Exemplo de resposta:

      {
        "message": "Hello World!"
      }


- ## 2. GET /hello/{name}

- ### Retorna uma mensagem de saudação simples. O parâmetro passado no path/url, irá refletir na resposta da mensagem. 

- ### Exemplo:

      http://127.0.0.1:8080/hello/Kelven

- ### Exemplo de resposta:

      {
        "message": "Hello Kelven!"
      }

- ## 2. POST /routePost

- ### Envia uma mensagem personalizada. Como é um rota POST, tem que enviar algo no corpo da requisição.

- ### Exemplo de corpo da requisição:

      {
        "message": "Ola, teste teste"
      }

- ### Exemplo de resposta:
  
      {
        "name": "Iae meu broder Ola, teste teste"
      }


- ## 2. POST /routePostDois

- ### Envia uma mensagem personalizada. Como é um rota POST, tem que enviar algo no corpo da requisição.

- ### Exemplo de corpo da requisição:

      {
        "message": "Ola, teste teste"
      }

- ### Exemplo de resposta:
  
      {
        "name": "Fala meu broder javeiro Ola, teste teste"
      }

## Autores
- [@Rodrigo_Kelven](https://github.com/Rodrigo-Kelven)
