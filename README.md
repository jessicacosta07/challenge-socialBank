# Desafio SocialBank

# Requisitos

* Java 11

* H2 database

* Spring Initializr: https://start.spring.io/

* Swagger

# Classe

* Model

A classe model mapea a tabela conta.

![image](https://user-images.githubusercontent.com/65916297/123187692-01b58b80-d471-11eb-837e-fb12ff170894.png)

* Repository

A classe repository é uma interface que extende JPARepository.

![image](https://user-images.githubusercontent.com/65916297/123187734-12fe9800-d471-11eb-94a7-1a72142fc463.png)

* Service

A classe service é a lógica da regra de negócio.

![image](https://user-images.githubusercontent.com/65916297/123187783-2b6eb280-d471-11eb-8b73-1b1f19b878b5.png)

* Controller

A classe controller contém as operações de CRUD: list, add, update e delete

![image](https://user-images.githubusercontent.com/65916297/123187869-5eb14180-d471-11eb-93fe-fab7d320d801.png)

![image](https://user-images.githubusercontent.com/65916297/123187922-81435a80-d471-11eb-9873-d653be50fc46.png)

* Configuration: configuração para embutir o swaggerno spring Boot

![image](https://user-images.githubusercontent.com/65916297/123188066-c1a2d880-d471-11eb-8506-7855edbc11e0.png)

# Executar a API

`http://localhost:8080/swagger-ui.html`

# Teste da API
![image](https://user-images.githubusercontent.com/65916297/123186639-f4979d00-d46e-11eb-93b1-d1f282f05b56.png)

