# A demo project for refreshable GCP Secret Manager
## To refresh a secret resides in GCP Secret Manager
1. Change the GCP project id in `bootstrap.properties`.
2. Under your GCP project, create a secret using [Secret Manager](https://cloud.google.com/secret-manager).
3. Change the `@Value` string in `CredentialRefreshConfig`.
4. Start the application.
5. Create a new version of secret using [Secret Manager](https://cloud.google.com/secret-manager).
6. Enter `curl -X POST http://localhost:8080/actuator/refresh` in the commend line to refresh the secret.