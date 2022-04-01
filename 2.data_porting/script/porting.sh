#!/bin/bash
docker cp ../data/* 1infra-postgres-1:/tmp
docker cp ./import.sql 1infra-postgres-1:/tmp
docker exec -d 1infra-postgres-1 chmod 755 /tmp/BSBDirectoryMar22-312.csv
docker exec -d 1infra-postgres-1 psql -U postgres -f /tmp/import.sql