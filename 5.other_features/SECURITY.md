# Security for the services

## Query service

To provide authentication of the service there are many option to implement this.
- Basic auth : user name / password
- LDAP integrated authentication
- jwt authentication *

Best option to authenticate this application is to use jwt token. And then in the future we can add authorisation as well for each individual user to provide role / user base permission to consume the service

## Subscribe service
Kafka also provides Role based authentication or ACL based authentication so when they put their certs on the consumer, we can check the permission to access it.