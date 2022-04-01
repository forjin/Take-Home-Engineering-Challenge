# Infra structure

## Docker as a infra

### Kafka
 - zookeeper
 - kafka broker
 - schema registry
 - kafka connect cluster

### External data storage
 - postgres : RDB
 - mysql : sink RDB

## Application component
 - Query service : rest api
 - Subscription service : Kafka connect - Kafka consumer
 - Data importer(?)

# Howe to create infra
Here is the command how to create infra structure for this project

```
docker compose up -d

