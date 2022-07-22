package com.example.refreshablesecretmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class SecretProvider {
  @Value("${application.secret}")
  private String secret;

  public String getSecret() {
    return secret;
  }
}
