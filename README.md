# A demo project for refreshable GCP Secret Manager
## To refresh a secret resides in GCP Secret Manager
1. Create a new version of secret.
2. enter `curl -X POST http://localhost:8080/actuator/refresh` in the commend line.