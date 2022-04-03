# BSB Query Service

Query service is snapshot service to show the customer request, so decieded to use restful api implementation.

## Architecture

- Spring web java application
- Actuator end point to check healthy of the service
- postgres database will be used in this service

## End point description

- /bsb : return full list of bsb object in one page
- /bsb/{query-bsb-string} : return specific bsb or if there is no matching result the return will be empty

To be improved
 - Able to use swagger to publish interface description and versioning
 - Pagenation can be implemented on full list query
## Application execution

To do application run on your local
```
./gradlew bootRun
```

To do test your application
```
./gradlew test
```
