# myJIRA
Создаю приложение похожее на JIRA с функциональностью:
- Ведение проектной деятельности;
- Подключение ИИ помощника.

## Этап 1: Выбор СУБД, создание схемы данных.
За основную СУБД берем PostgreSQL.
см. [схема данных](./data-scheme/myJIRA.sql).

## Этап 2: Разработка backend.
Проект будем реализовывать с применением Spring Boot, на платформе Java 21 используя [Zulu JDK FX](https://www.azul.com/core-post-download/?endpoint=zulu&uuid=ba2dc6eb-1dae-44af-a4f5-760bb2c23553).

### Используемые зависимости
- Spring Web;
- PostgreSQL Driver;
- SpringData JPA;
- Spring Security;
- Validation;
- Spring Boot DevTools;
- Liquibase Migration;
- Lombok.

### Справочная документация
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.0/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.0/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.0/reference/web/servlet.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.5.0/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Security](https://docs.spring.io/spring-boot/3.5.0/reference/web/spring-security.html)
* [Validation](https://docs.spring.io/spring-boot/3.5.0/reference/io/validation.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.5.0/reference/using/devtools.html)
* [Liquibase Migration](https://docs.spring.io/spring-boot/3.5.0/how-to/data-initialization.html#howto.data-initialization.migration-tool.liquibase)

### Справочные руководства
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)

### Справочное переопределение Maven Parents
Из-за дизайна Maven элементы наследуются от родительского POM к POM проекта.
Хотя большая часть наследования в порядке, оно также наследует нежелательные элементы, такие как `<license>` и `<developers>` от родителя.
Чтобы предотвратить это, POM проекта содержит пустые переопределения для этих элементов.
Если вы вручную переключаетесь на другого родителя и на самом деле хотите наследование, вам нужно удалить эти переопределения.
