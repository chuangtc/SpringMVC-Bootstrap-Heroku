SpringMVC-Bootstrap-Heroku
==========================

SpringMVC 4, Bootstrap 3, and embedded Tomcat 7 to Heroku cloud

##Main Purposes
 - The unofficial Spring MVC 4 Showcase with Bootstrap 3
 - It's cloud deploy-able (Heroku) (Easier to swtich from PaaS cloud to IaaS cloud, or to a different cloud provider)
 - For configuration of Spring MVC, it uses Java config instead of xml config.

##Build and run the app in command line environment
###Build package
```sh
$ mvn package
```
####Run  webapp (If you don't need to deploy to Heroku, you can run the webapp by executing)
```sh
$ ./run.sh
or
$ java -jar target/dependency/webapp-runner.jar target/*.war
```
####Test it
Go to http://localhost:8080 and test it out by putting your name

##Steps to set up development environment in Eclipse
After you clone this project from github, run 
```sh
$ mvn package
$ mvn eclipse:eclipse
```
1. Open Eclipse to import the project
2. Click top File -> Import -> Maven -> Existing Maven Projects (Choose the folder that you just downloded)
3. Right click your project, click Properties -> Java Build Path, remove all M2_REPO/******/****** jars (names started with M2_REPO), click OK.
4. Check if Maven dependencies are setup correctly. Right click your project, click Properties -> Java Build Path-> Libraries, and the Maven Dependencies include all your dependent jar files 
5. Right click pom.xml, click Run as-> Maven clean, then Run as-> Maven Install
6. Right click your project, click Run as -> Run on server (Supposed you already set up your local Tomcat server)

## Deploying to Heroku (you might need to clean out the .git folder)
Files which are used by Heroku: Procfile, and system.properties 
To push webapp app to production on Heroku, you need to run 
####First time, to create and push
```sh
$ heroku create
$ git push heroku master
```
####In the future, to push your webapp, run
```sh
$ heroku git:remote -a yourapp
$ git push heroku master
```
###Libraries Used:
Spring 4.0.6
Twitter Bootstrap 3.2.0
Apache Tomcat 7.0.40 (webapp-runner)
JSP, JQuery 1.11.1

###Development environment
Windows 8 64bit, Cygwin 64 bit, Eclipse Java EE IDE Luna 4.4.0, Maven 3.2.3 

###Reference
- [Running Java app on Heroku](https://devcenter.heroku.com/categories/java)
- [Spring Web MVC 4 documentation](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html)

###Author
[Tzu-Cheng Chuang](http://chuangtc.com)