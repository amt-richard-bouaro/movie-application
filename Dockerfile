# Use the official OpenJDK base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/your-spring-boot-app.jar /app/app.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 5000

# Define environment variables for MongoDB connection
ENV SPRING_DATA_MONGODB_URI=mongodb://localhost:27017/movies-api-db
ENV SPRING_DATA_MONGODB_DATABASE=movies-api-db

# Command to run the application
CMD ["java", "-jar", "app.jar"]
