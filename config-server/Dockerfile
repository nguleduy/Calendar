# Start with a base image containing Java runtime
FROM adoptopenjdk/openjdk11:latest

# Add Maintainer Info
MAINTAINER Joseph <joseph89.dev@gmail.com>

# Make port 8031 available to the world outside this container
EXPOSE 8031

# The application's jar file
ARG JAR_FILE=target/config-server-0.0.1.jar

# Add the application's jar to the container
ADD ${JAR_FILE} config-server.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/config-server.jar"]
