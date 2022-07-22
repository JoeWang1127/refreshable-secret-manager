package com.example.refreshablesecretmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class SecretProvider implements SecretIdProvider {
  @Value("${application.secret-id}")
  private String secretId;

  public String getSecretId() {
    return secretId;
  }
}
