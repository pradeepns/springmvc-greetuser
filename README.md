springmvc-greetuser
===================

Spring MVC sample application using Eclipse IDE + Tomcat Server + Maven

How to setup Spring MVC application in Eclipse IDE using Maven [Windows Machine]
1. Exceute below Maven command on command prompt.
mvn archetype:generate -DgroupId={package} -DartifactId={application_name} -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
2. Execute below command to make it Eclipse web project
mvn eclipse:eclipse -Dwtpversion=2.0
3. Switch to project folder, open pom.xml, add necessary jar file dependencies
4. execute "mvn clean install"
5. Open Eclise IDE --> import --> Import as Existing Maven Project --> Select project folder --> click finish
6. Under src.main create your source package
7. Add GreetUser.java
8. Edit index.jsp, add hellowrold.jsp
9. Edit web.xml
10. Add spring config file i.e. "springmvc-servlet.xml"
11. Package application by issuing "mvn package". It will create WAR file
12. Add WAR file to local tomcat(6) server and start the server
13. Hit the application url "http://localhost:8088/springmvc/greetUser/PradeepNS"
