# mysqldemo

## Introduction
Practise how to connect to an existing MySql database to fetch data from REST API

## Reference
1. Demo data can be download from https://www.mysqltutorial.org/mysql-sample-database.aspx

## Learning

### application.properties

#### Resolve column names naturally from @Table(name = "hello") and @Column(name = "name") respectively from POJO with the following properties added
spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl

### @Controller vs @RestController

Requires @ResponseBody with @Controller and can directly use @RestController instead

### @Repository

Omit the @Repository annotation at all JpaRepository

## TODO

### Junit 5 Test cases
### Add more GetMapping methods with PathVariables
