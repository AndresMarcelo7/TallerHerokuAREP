# Statistic WEB Calculator AREP

A Solution for AREP Workshop "Taller de Introducción a Heroku"
[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://desolate-fjord-84057.herokuapp.com/inputdata)
[![CircleCI](https://circleci.com/gh/AndresMarcelo7/TallerHerokuAREP.svg?style=svg)](https://circleci.com/gh/AndresMarcelo7/TallerHerokuAREP)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
### Prerequisites

The things you need in order to run this proyect on your computer are:
- Maven
- Git  
- Java
- Heroku CLI (If you want to deploy this app by yourself)

Make sure you have this installed with the commands
```
mvn --version
```
```
git --version
```
```
java -showversion
```
and 
```
heroku -v
```

This project was developed with Java V1.8

### Installing
Please clone this repository on your computer with the command:

```
git clone https://github.com/AndresMarcelo7/TallerHerokuAREP
```
Once finished, you must navigate into the project and execute the command 'mvn package' like this:
```
C:\Users\User > cd /TallerHerokuAREP
```
```
C:\Users\User > mvn package
```
Here, mvn package Builds the project and packages the resulting JAR file into the target directory.

## Running the tests

if you want to run the tests again please run the following command:

```
C:\Users\User > mvn test
```
## Run

If you want to locally deploy the app use the following command:
```
C:\Users\User\TallerHerokuAREP > java -cp "target/classes;target/dependency/*" edu.eci.arep.CalculatorWebApp.WebApp.App
```
Then go to http://localhost:4567/inputdata in order to see the program locally deployed

Put your test cases (It only will receive Integers and Float(.) numbers separated by comma "," in other cases the program will show you and Input error on your browser.

The application is deployed with heroku and the link is at the top of this document (Heroku button)


## Documentation
If you want to see the Project Documentation Please click [here](https://andresmarcelo7.github.io/TallerHerokuAREP/)

If you want to run with maven the project Documentation, follow this instructions:
- On the project directory run the following commands:
```
C:\Users\User\CalculadoraEstadisticaAREP > mvn javadoc:javadoc
```
```
C:\Users\User\CalculadoraEstadisticaAREP > mvn site
```
```
C:\Users\User\CalculadoraEstadisticaAREP > mvn site:run
```
This last commands will open the 8080 port in order to post the Javadoc file on your browser with the localhost URL http://localhost:8080  

Also you will find a [Documentation.pdf file](/Documentacion.pdf)  that describes the design and structures of the project 

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* CircleCI for Continous Integration   [![CircleCI](https://circleci.com/gh/AndresMarcelo7/TallerHerokuAREP.svg?style=svg)](https://circleci.com/gh/AndresMarcelo7/TallerHerokuAREP)
* Git - Version Control  
* Heroku Deployment. [![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://desolate-fjord-84057.herokuapp.com/inputdata)
 
## Versioning

 For the versions available, see the [tags on this repository](https://github.com/AndresMarcelo7/TallerHerokuAREP/tags). 

## Authors

* **Andrés Felipe Marcelo** - [AndresMarcelo7](https://github.com/AndresMarcelo7)

## License

This project is licensed under the GNU v3.0 License - see the [LICENSE](LICENSE) file for details


