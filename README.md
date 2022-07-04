# StreamingQueryListenerGateway
This project creates bridge for PySpark to use `StreamQueryListener` class from java in python. \
In this article we explain and show examples of how to use this jar with PySpark project: 
[Medium article](https://medium.com/myheritage-engineering/guide-to-streamingquerylistener-in-pyspark-streaming-f3bbfe56a774)


## Dependencies
Tested it Spark `3.1.2` version, should also work for other Spark versions.

## Copyrights
This project is based on this Stackoverflow comment: 
[Stackoverflow link](https://stackoverflow.com/questions/47357418/how-to-get-the-output-from-console-streaming-sink-in-zeppelin)

## Setup
Building command:

    mvn clean install

After Building the project jar, we can use it like this with PySpark: 

    pyspark --jars StreamingQueryListenerGateway-{version}.jar
