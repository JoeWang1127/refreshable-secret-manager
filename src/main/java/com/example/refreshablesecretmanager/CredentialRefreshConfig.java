package com.example.refreshablesecretmanager;

import com.google.cloud.spring.secretmanager.SecretManagerTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CredentialRefreshConfig {
  private final SecretManagerTemplate secretManagerTemplate;

  @Value("sm://demo-secret")
  private String secretIdentifier;

  public CredentialRefreshConfig(SecretManagerTemplate template) {
    this.secretManagerTemplate = template;
  }

  @Bean
  @RefreshScope
  public SecretProvider secretManagerProvider() {
    String secret = secretManagerTemplate.getSecretString(secretIdentifier);
    return new SecretProvider(secret);
  }
}
