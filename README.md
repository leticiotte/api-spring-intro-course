# API desenvolvida a partir do curso do [Valdir Cezar](https://www.youtube.com/playlist?list=PLA8Qj9w4RGkXwPerFo4ZDFEessyNJW1ol)

API desenvolvida com os seguintes recursos:
  1. Java
  2. Spring Boot
  3. Clean code
  4. Clean architecture

# Rotas
### Users
#### [GET] /users <br>
Retorna todos os usuários<br>

#### [POST] /users <br>
Adiciona um usuário no sistema<br>
  > Body example:
```
{
    "name": "Letícia Gonçalves",
    "login": "leticiagon",
    "password": "senha123"
}
```
<br>

#### [GET] /users/{id} <br>
Retorna o usuário referente ao id informado<br>

#### [PUT] /users/{id} <br>
Altera o usuário referente ao id informado<br>
  > Body example:
```
{
    "name": "Letícia Gonçalves",
    "login": "letgon",
    "password": "senha123"
}
```

#### [DEL] /users/{id} <br>
Delete o usuário referente ao id informado<br>
