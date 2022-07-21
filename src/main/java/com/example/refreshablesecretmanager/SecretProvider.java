package com.example.refreshablesecretmanager;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "application")
public class SecretProvider {

  private String secret;

  public SecretProvider(String secret) {
    this.secret = secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public String getSecret() {
    return secret;
  }
}
