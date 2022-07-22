package com.example.refreshablesecretmanager;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConfigurationProperties(prefix = "application")
@ConfigurationPropertiesScan
@ConstructorBinding
@RefreshScope
public class SecretProvider2 implements SecretIdProvider {
  private final String secretId;

  public SecretProvider2(String secretId) {
    this.secretId = secretId;
  }

  public String getSecretId() {
    return secretId;
  }
}
