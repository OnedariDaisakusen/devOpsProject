# Etapa 1: usar una imagen base de Java moderna (OpenJDK 21 por ejemplo)
FROM eclipse-temurin:21-jdk-alpine

# Crear un directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el jar al contenedor
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto (opcional, si tu app usa uno)
EXPOSE 8080

# Comando de inicio
ENTRYPOINT ["java", "-jar", "app.jar"]
