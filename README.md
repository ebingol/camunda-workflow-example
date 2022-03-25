# camunda-workflow-example


##### Build jar
``
mvn package -DskipTests
``
##### Build Docker image
``
docker build -t camunda-workflow-example .
``
###### Run Docker container with default property set in Dockerfile
``
docker run --name camunda-workflow-app -p 8080:8080 -d camunda-workflow-example
``
##### Enter Docker container
``
docker exec -t -i camunda-workflow-app /bin/bash