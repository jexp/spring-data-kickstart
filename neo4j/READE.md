# Spring Data Neo4j Kickstart Project

This project provides basic skeleton setup for a Spring Data Neo4j based app. It will set up the following:

* A plain Java project based on the latest Spring Data Neo4j and Logback for logging.
* The necessary Spring XML configuration (`src/main/resources/META-INF/spring/application-context.xml`) to set up a Spring Data Neo4j's infrastructure and activate Spring Data repositories.
* A sample `ApplicationTest` (in `com.acme` inside `src/test/java`) to bootstrap this configuration.

To adapt the skeleton to your needs you mostly need to do the following:

* Adapt groupId and artifactId according to your project requirements
* Optionally switch to the advanced mapping mode by choosing `spring-data-neo4j-aspects` as dependency
* Create entities and repositories inside `src/main/java` according to your project and adapt the `base-package` attribute in the `<neo4j:repositories />` element inside `src/main/resources/META_INF/spring/application-context.xml`.

* [More Information about Spring Data Neo4j](http://springsource.org/spring-data/neo4j) and [Neo4j](http://neo4j.org)
