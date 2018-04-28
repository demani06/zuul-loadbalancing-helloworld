
#To run the hello world on port 8083
java -jar eureka-client-hello-world-0.0.1-SNAPSHOT.jar server.port=8083

#To run the hello world on port 8082
java -jar eureka-client-hello-world-0.0.1-SNAPSHOT.jar server.port=8082

Zuul Server API link -  http://localhost:8762/spring-cloud-eureka-client/greeting

This should print the hello world message with port number and it will be changed on refresh to other port (8082/8083)
