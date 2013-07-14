NIOHTTPServer
=============

NIO Example HTTP server ship with JDK

Build the project with Maven build too using following command

        mvn clean install

Build the project with dependency libraries using following maven build command

        mvn clean assembly:assembly

Execute the program from the build jar which is located under target folder


	java -jar target/NIOHTTPServer-1.0-jar-with-dependencies.jar N2 -port 8000 -webroot /www/mysite/
