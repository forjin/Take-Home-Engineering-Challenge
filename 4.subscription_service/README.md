# Subscription Service

This application provides a realtime publish service for customers to serve our data changes.
It uses kafka as a primary service provider so if you want to subscribe this service, please consider create kafka consumer application.

## Architect

This application is composed of kafka and it's connect source tasks. So once database changes are detected kafka-connect send messages to the topic so consumers are able to notifiy it's changes.
Using kafka has benefitail for muitiple customer can notified at the same time real time, even though they can not received right away, they can get the message any time when connection established.
And the connection between kafka and consumers are SSL / TLS 1.3 and serialized with Avro.


## Details for the consumers

It uses kafka as a primary service provider so if you want to subscribe this service, please consider create kafka consumer application.

Published endpoint
 - Topic : postgres.public.bsb
 - Key Schema : String bsb number
 - Value Schema : Avro the record changes

## Execion of the soruce connector
This command below deploy kafka source task to the connect cluster.
```
./source-connect-deploy.sh 
```

## <Optional> Sink connector
We can offer to the customer who wants to syncronise database to theirs which can provide database details. But if it's external.
```
./source-connect-deploy.sh 
```

## Demo for the consumer
Added example <kafka-consumer-avro> is the example of the consumer application for customer.
To run the application
```
./gradlew bootRun
```