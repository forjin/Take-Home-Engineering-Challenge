# Monitoring

## Query service
Query service has health check (actuator) so we can check the service healthy and if we deployed with kubernetes it can be monitored by kubernetes load balancer so if it's down kubernetes automatically create new container to replace them.

## Subscribe service
Kafka has a monitoring tools named control center for it's cluster healthy and each broker failure will be monitored and be notified if it has a failure.