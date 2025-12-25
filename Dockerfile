
FROM eclipse-temurin:17-jdk

COPY hello.java .
RUN javac hello.java
CMD ["java","hello"]
