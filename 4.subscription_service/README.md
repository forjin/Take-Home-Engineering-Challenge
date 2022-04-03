# Subscription Service

This application provides a realtime publish service for customers to serve our data changes.
It uses kafka as a primary service provider so if you want to subscribe this service, please consider create kafka consumer application.

## Architect

It uses kafka as a primary service provider so if you want to subscribe this service, please consider create kafka consumer application.

Published endpoint
 - Topic : postgres.public.bsb
 - Key Schema : String bsb number
 - Value Schema : Avro the record changes

