#!/bin/bash

curl -X POST http://localhost:8083/connectors -H "Content-Type: application/json" -d '{
     "name": "jdbc_sink_mysql",
     "config": {
                "connector.class": "io.confluent.connect.jdbc.JdbcSinkConnector",
                "connection.url": "jdbc:mysql://1infra-mysql-1:3306/mydb?user=user&password=pass",
                "tasks.max": "1",
                "topics": "postgres.public.bsb",
                "auto.create": "true",
                "insert.mode": "upsert",
                "pk.mode": "record_value",
                "pk.fields": "bsb",
                "value.converter.schema.registry.url": "http://schema-registry:8081",
                "value.converter": "io.confluent.connect.avro.AvroConverter",
                "transforms": "newState, topicName",
                "transforms.newState.type": "io.debezium.transforms.ExtractNewRecordState",
                "transforms.newState.drop.tombstones": "false",
                "transforms.topicName.type": "org.apache.kafka.connect.transforms.RegexRouter",
                "transforms.topicName.regex": "([^.]+)\\.([^.]+)\\.([^.]+)",
                "transforms.topicName.replacement": "$3"
             }
     }'