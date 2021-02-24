FROM maven:3.6.3-jdk-8

COPY . /root/mcloud_service

WORKDIR /root/mcloud_service

RUN mvn clean install

EXPOSE 8081

CMD mvnw spring-boot:run
