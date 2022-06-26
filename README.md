# StreamingQueryListenerGateway

This Project creates bridge for pyspark to use StreamQueryListener in java.
Based on this stackoverflow comment: https://stackoverflow.com/questions/47357418/how-to-get-the-output-from-console-streaming-sink-in-zeppelin

## Dependencies

Project use spark packages version `3.1.2`

## How to use jar

After Building project jar, we will use it in pyspark like this:
`pyspark --jars StreamingQueryListenerGateway-{version}.jar`
