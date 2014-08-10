This is the code sample for the short introduction to Jetty/Jersey web stack, based on the following blog post:

http://hajix.wordpress.com/2014/08/07/starting-a-simple-server-with-jettyjerseyguicejackson-stack/

To use, after cloning the repository, use:

mvn clean package

java -cp target/jetty-jersey-guice-jackson-1.0-SNAPSHOT-jar-with-dependenci.jar com.hajix.example.Main


and then in the console, try either of these two commands:

curl -X POST -H "content-type: application/json" -d '{"key":"age", "value": 100}' http://localhost:5000/rest

curl -X GET http://localhost:5000/rest?text=Hello,%20world
