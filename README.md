# java-spring-crud-base
Repositório base para projetos Java baseados em Spring Boot voltado para a construção de APIs.

## Motivação

Demonstrar uma aplicação que gerencia um CRUD - _Create, Read, Update, Delete_ criado na linguagem Java (por meio do framework Spring Boot) e utilizando MongoDB como banco de dados da aplicação.

A linguagem Java é hoje uma das mais utilizadas devido à sua versatilidade, robustez e facilidade de uso, além de possuir uma grande comunidade que desenvolveu inúmeras soluções em bibliotecas e frameworks que facilitam a vida do desenvolvedor e aceleram o processo do desenvolvimento. Isso permite que quem programa possa focar em entregar soluções e deixar partes mais trabalhosas e repetitivas da criação de código a cargo dos frameworks.

Um destes frameworks utilizados nesta solução é o Spring Boot, cujo desenho permite que uma aplicação Java básica já esteja pronta para se conectar com a web e bancos de dados diretamente com uma configuração mínima. As annotations e beans que o Spring Boot provê permitem a escrita de códigos mais legíveis e fáceis de se manter; além disso, este também permite a injeção de dependências, ideais para a criação de módulos independentes que por sua vez são ideais para a criação de microsserviços e ecossistemas que os utilizem.

O banco de dados MongoDB é um banco NoSQL, isto é, este armazena dados de maneira diferente ao modelo tradicional de base de dados relacional. Em particular, o MongoDB utiliza um formato de armazenamento denominado "documento", que nada mais é que um objeto no formato JSON contendo as propriedades do dado salvo. Não houve uma motivação particular para este projeto utilizar o MongoDB; no entanto, existem casos de uso em que sua utilização se mostra viável, tais como projetos em que armazenamento de dados em tempo real e stream de dados são necessários.

## O Projeto
O projeto é um simples CRUD que modela a criação, leitura, atualização e remoção de um único modelo de um funcionário de uma empresa; este foi modelado como uma entidade "Employee", que contém dados como nome, posição na empresa e data de início.

## Routes/Rotas

As rotas expostas podem ser conferidas por meio da documentação Swagger, no endpoint:

```
/swagger-ui.html
```

Além destas, existe a seguinte rota que não está descrita no Swagger:

```
/actuator
```

Que é um endereço que permite verificações e health checks da aplicação. Possui um sub-path em /health que retorna o status da aplicação e pode ser utilizado como health check.

## Como rodar o projeto
*Em construção*