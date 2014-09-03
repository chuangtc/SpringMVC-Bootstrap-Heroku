SpringMVC-Bootstrap-Tomcat7
==========================

SpringMVC 4, Bootstrap 3, and embedded Tomcat 7 

##Main Purposes
 - The unofficial Spring MVC 4 Showcase with Bootstrap 3
 - There is embedded tomcat 7
 - For configuration of Spring MVC, it uses Java config instead of xml config.
 - Change the build tool to Gradle (Heroku cloud might not be compatible)

##Build and run the app in command line environment

###Build package
```sh
$ gradle build 
```

####Run  webapp
```sh
$ ./run.sh
or
$ java -jar build/dependency/webapp-runner.jar build/libs/*.war
```
####Test it
Go to http://localhost:8080 and test it out by putting your name

###Libraries Used:
Spring 4.0.6

Twitter Bootstrap 3.2.0

Apache Tomcat 7.0.40 (webapp-runner)

JSP, JQuery 1.11.1

###Development environment
Linux 64bit, Eclipse Java EE IDE Luna 4.4.0, Gradle 2.0

###Reference
- [Spring Web MVC 4 documentation](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html)

###Author
Tzu-Cheng Chuang](http://chuangtc.com)
