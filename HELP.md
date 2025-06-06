# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.0-M3/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.0-M3/maven-plugin/build-image.html)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/3.5.0-M3/reference/web/reactive.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.5.0-M3/reference/using/devtools.html)
* [Spring Session](https://docs.spring.io/spring-session/reference/)
* [Spring Web Services](https://docs.spring.io/spring-boot/3.5.0-M3/reference/io/webservices.html)
* [Spring Security](https://docs.spring.io/spring-boot/3.5.0-M3/reference/web/spring-security.html)
* [OAuth2 Client](https://docs.spring.io/spring-boot/3.5.0-M3/reference/web/spring-security.html#web.security.oauth2.client)
* [OAuth2 Authorization Server](https://docs.spring.io/spring-boot/3.5.0-M3/reference/web/spring-security.html#web.security.oauth2.authorization-server)
* [OAuth2 Resource Server](https://docs.spring.io/spring-boot/3.5.0-M3/reference/web/spring-security.html#web.security.oauth2.server)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/3.5.0-M3/reference/messaging/kafka.html)
* [Validation](https://docs.spring.io/spring-boot/3.5.0-M3/reference/io/validation.html)
* [Spring Batch](https://docs.spring.io/spring-boot/3.5.0-M3/how-to/batch.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/3.5.0-M3/reference/actuator/index.html)
* [Dynatrace](https://docs.spring.io/spring-boot/3.5.0-M3/reference/actuator/metrics.html#actuator.metrics.export.dynatrace)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

