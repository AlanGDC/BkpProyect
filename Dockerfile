FROM maven:3.5.2-jdk-8
COPY pom.xml /app/pom.xml
WORKDIR /app
RUN mvn -Dmaven.repo.local=/m2 clean compile test -DskipTests
RUN echo "hola"
COPY . /app

CMD mvn -Dmaven.repo.local=/m2 test
