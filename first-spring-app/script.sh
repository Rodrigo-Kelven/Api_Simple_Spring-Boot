#/bin/bash

./gradlew build
docker build -t minha-api-spring-boot .
docker run -p 8080:8080 minha-api-spring-boot
