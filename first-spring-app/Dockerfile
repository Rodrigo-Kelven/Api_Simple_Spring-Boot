# Escolher a imagem base do Java
FROM openjdk:17-jdk-slim

# Informar o diretório de trabalho no container
WORKDIR /app

# Copiar o JAR gerado para dentro do container
COPY build/libs/first-spring-app-0.0.1-SNAPSHOT.jar /app/first-spring-app-0.0.1-SNAPSHOT.jar


# Expôr a porta em que a API vai rodar
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app/first-spring-app-0.0.1-SNAPSHOT.jar"]
