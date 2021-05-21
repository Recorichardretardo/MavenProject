https://mkyong.com/maven/how-to-create-a-manifest-file-with-maven/
https://stackoverflow.com/questions/34712885/how-to-load-an-external-properties-file-from-a-maven-java-project
https://stackoverflow.com/questions/36768467/external-properties-file-for-an-executable-jar
https://stackoverflow.com/questions/849389/how-to-read-an-external-properties-file-in-maven
https://stackoverflow.com/questions/19424308/add-properties-file-to-build-path-of-runnable-jar


https://www.codejava.net/coding/how-to-create-executable-jar-file-with-resources-and-dependencies-using-maven-in-eclipse

The packaging type of the project must be jar: <packaging>jar</packaging>


And to generate the JAR file from the project, run Maven with the goal assembly:single. For example, in the command line:
mvn clean install assembly:single