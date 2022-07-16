
# **README SERENITY WEB TRAINING**
***

Requisitos del proyecto:
* [Gradle]: version 6.3 
* [JDk]: version 1.8

## **Run tests gradle:**
```
./gradle clean test
./gradle clean test -Dwebdriver.driver=chrome -Denvironment=prod
./gradle clean test -Dwebdriver.driver=firefox -Denvironment=prod
./gradle clean test -Dcucumber.options="--tags @testLogin"
./gradle clean test -Dcucumber.options="--tags '@testLogin or @testRemember'"
```
cucumber.options might be cucumberOptions according to version
## **Run tests maven:**
```
./mvn clean verify
./mvn clean verify -Dwebdriver.driver=chrome -Denvironment=prod
./mvn clean verify -Dwebdriver.driver=firefox -Denvironment=prod
```
