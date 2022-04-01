#!/bin/bash

curl -X POST http://localhost:8083/connectors -H "Content-Type: application/json" -d '{
              "name": "jdbc_source_postgres_v1.0",
              "config": {
                        "connector.class": "io.debezium.connector.postgresql.PostgresConnector", 
                        "database.hostname": "1infra-postgres-1", 
                        "database.port": "5432", 
                        "database.user": "postgres", 
                        "database.password": "postgres", 
                        "database.dbname" : "postgres", 
                        "database.server.name": "postgres", 
                        "table.include.list": "public.bsb",
                        "plugin.name": "pgoutput",
                        "decimal.handling.mode": "string",
                        "database.history.kafka.bootstrap.servers": "broker:9092",
                        "database.history.kafka.topic": "public.db_history"                        
                      }
              }'