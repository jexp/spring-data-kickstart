# Spring Data JPA Kickstart Project

This project provides basic skeleton setup for a Spring Data JPA based app. It will set up the following:

* A plain Java project based on the latest Spring Data JPA and Hibernate as persistence provider using an HSQL in-memory database by default and Logback for logging.
* The necessary Spring JavaConfig configuration (`ApplicationConfig` in `com.acme` inside `src/main/java`) to set up a `DataSource`, `EntityManagerFactory`, `JpaTransactionManager` and activate Spring Data repositories.
* A sample `ApplicationTest` (in `com.acme` inside `src/test/java`) to bootstrap this configuration.

To adapt the skeleton to your needs you mostly need to do the following:

* Adapt groupId and artifactId according to your project requirements
* Optionally choose your persistence provider and adapt `pom.xml` accordingly, the default uses Hibernate. If you switch to a different persistence provider make sure you adapt the configuration of the `LocalContainerEntityManagerFactoryBean` inside `application-context.xml`.
* Create entities and repositories inside `src/main/java` according to your project and adapt the `base-package` attribute in the `<jpa:repositories />` element inside `src/main/resources/META_INF/spring/application-context.xml` as well as the `packagesToScan` property of the `LocalContainerEntityManagerFactoryBean`.