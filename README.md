
https://mkyong.com/maven/how-to-create-a-manifest-file-with-maven/

https://stackoverflow.com/questions/34712885/how-to-load-an-external-properties-file-from-a-maven-java-project


https://stackoverflow.com/questions/36768467/external-properties-file-for-an-executable-jar

https://stackoverflow.com/questions/849389/how-to-read-an-external-properties-file-in-maven

https://stackoverflow.com/questions/19424308/add-properties-file-to-build-path-of-runnable-jar


https://www.codejava.net/coding/


```

how-to-create-executable-jar-file-with-resources-and-dependencies-using-maven-in-eclipse


The packaging type of the project must be jar: <packaging>jar</packaging>

And to generate the JAR file from the project, run Maven with the goal assembly:single. For example, in the command line:


clean compile assembly:assembly

clean assembly:assembly

clean install assembly:single

mvn clean install assembly:single

```

https://mkyong.com/maven/how-to-create-a-jar-file-with-maven/


```
java -jar testexample-0.0.1-SNAPSHOT.jar 

java -jar testexample-0.0.1-SNAPSHOT.jar Hello

java -jar testexample-0.0.1-SNAPSHOT.jar Hi

java -jar testexample-0.0.1-SNAPSHOT.jar Hi Hello
```

https://dev.to/saiupadhyayula/maven-complete-tutorial-for-beginners-1jek

https://stackoverflow.com/questions/24727536/maven-skip-tests

https://stackoverflow.com/questions/10019549/how-to-eclipse-maven-install-build-jar-with-dependencies


https://stackoverflow.com/questions/11758594/how-do-i-put-all-required-jar-files-in-a-library-folder-inside-the-final-jar-fil