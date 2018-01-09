# SBG71restJPA

Keep this project as reference for a different global CORS configuration !!!

Spring Boot with Gradle + Spring Data JPA + Spring Data REST

From project SPBG71restJPA Contains:

    Spring Boot with Gradle
    Spring Data Rest
    Spring Data JPA

Build $ gradlew BootRun

Insert componets with CURL $ curl -i -X POST -H "Content-Type:application/json" -d '{ "firstName" : "F01", "lastName" : "L01" }' http://localhost:8090/people $ curl -i -X POST -H "Content-Type:application/json" -d '{ "firstName" : "F02", "lastName" : "L02" }' http://localhost:8090/people

Check components with CURL $ curl http://localhost:8090 $ curl http://localhost:8090/people $ curl http://localhost:8090/people/1 $ curl http://localhost:8090/people/2

Browse: http://localhost:8090/people http://localhost:8090/people/1 http://localhost:8090/people/2
