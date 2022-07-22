package com.example.refreshablesecretmanager;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConfigurationProperties(prefix = "application")
@ConfigurationPropertiesScan
@RefreshScope
public class SecretProvider2 {
  private String secret;

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public String getSecret() {
    return secret;
  }
}
