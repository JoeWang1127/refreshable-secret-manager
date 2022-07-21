package com.example.refreshablesecretmanager;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConstructorBinding
@ConfigurationProperties(prefix = "application")
@RefreshScope
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
