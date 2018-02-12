# Spring cloud training
Homework of "Spring cloud" courses.

### Lab 3
* Simple client to retrieve lucky word
* Config server to send lucky word to client

### Lab 4 
* Eureka server
* Config server to send common configs and profile-specific configs
* Services to create a sentence which consists of noun, article, adjective, subject, verb
* Sentence service which calls another service for sentence parts

### Lab 5
* Eureka server
* Config server to send common configs and profile-specific configs
* Services to create a sentence which consists of noun, cold-noun (which uses the same name as noun but with another content), article, adjective, subject, verb
* Sentence service which calls another service for sentence parts (with configured Ribbon to use both noun services)

### Lab 6
* Eureka server
* Config server to send common configs and profile-specific configs
* Services to create a sentence which consists of noun, cold-noun (which uses the same name as noun but with another content), article, adjective, subject, verb
* Sentence service which calls another service for sentence parts through Feign
* Ribbon load balancing is implemented with Feign internally

### Lab 7
* Eureka server
* Config server to send common configs and profile-specific configs
* Services to create a sentence which consists of noun, cold-noun (which uses the same name as noun but with another content), article, adjective, subject, verb
* Sentence service which calls another service for sentence parts through Feign
* Ribbon load balancing is implemented with Feign internally
* Hystrix is provided with fallback methods 
* Hystrix dashboard is available for Hystrix states monitoring

### Lab 8
* Eureka server
* Config server to send common configs and profile-specific configs
* Services to create a sentence which consists of noun, cold-noun (which uses the same name as noun but with another content), article, adjective, subject, verb
* Sentence service which calls another service for sentence parts through Feign
* Ribbon load balancing is implemented with Feign internally
* Hystrix is provided with fallback methods 
* Hystrix dashboard is available for Hystrix states monitoring
* Spring cloud bus for dynamic configuration changes
