# java-spring-crud-base
Repositório base para projetos Java baseados em Spring Boot voltado para a construção de APIs.

## Motivação

A linguagem Java é hoje uma das mais utilizadas devido à sua versatilidade, robustez e facilidade de uso, além de possuir uma grande comunidade que desenvolveu inúmeras soluções em bibliotecas e frameworks que facilitam a vida do desenvolvedor e aceleram o processo do desenvolvimento. Isso permite que quem programa possa focar em entregar soluções e deixar partes mais trabalhosas e repetitivas da criação de código a cargo dos frameworks.

Um destes frameworks utilizados nesta solução é o Spring Boot, cujo desenho permite que uma aplicação Java básica já esteja pronta para se conectar com a web e bancos de dados diretamente com uma configuração mínima. As annotations e beans que o Spring Boot provê permitem a escrita de códigos mais legíveis e fáceis de se manter; além disso, este também permite a injeção de dependências, ideais para a criação de módulos independentes que por sua vez são ideais para a criação de microsserviços e ecossistemas que os utilizem.

## Routes/Rotas

```
/actuator
```
Rota que permite verificações e health checks da aplicação. Possui um sub-path em /health que retorna o status da aplicação.