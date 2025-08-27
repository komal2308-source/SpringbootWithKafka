# Kafka Hello Basic (Spring Boot)

This is the simplest Spring Boot project demonstrating:
- A REST GET endpoint that sends a "Hello World" message to Kafka
- A consumer that listens to the topic and prints the message

## Quick start

1. Start Kafka & Zookeeper:
   ```
   docker-compose up -d
   ```

2. Create topic:
   ```
   docker exec -it $(docker ps -qf "ancestor=confluentinc/cp-kafka:7.6.0") kafka-topics --create --topic hello-topic --bootstrap-server localhost:9092
   ```

3. Run the app:
   ```
   mvn spring-boot:run
   ```

4. Call endpoint:
   ```
   curl http://localhost:8080/send/HelloWorld
   ```

You should see the consumer log the received message.
