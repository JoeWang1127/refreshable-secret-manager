# A demo project for refreshable GCP Secret Manager
## Steps to retrieve & fresh secret
1. Change project ID in `bootstrap.properties`.
2. Change secret ID in `application.yml`. Note that there is no `${}` around the variable.
3. Run the application.
4. Browser the secret content in `http://localhost:8080/getSecret`.
5. In your GCP console, create a new version of secret under the same secret ID.
6. Send a `POST` request to the server: `curl -X POST http://localhost:8080/actuator/refresh`.
7. Refresh the page to see the newly added secret.