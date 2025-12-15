FROM eclipse-temurin:21
WORKDIR /app
COPY Login.java .
RUN javac Login.java
CMD ["java", "Login"]
