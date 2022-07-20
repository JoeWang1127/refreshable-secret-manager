package com.example.refreshablesecretmanager;

class SecretProvider {
  private String secret;

  public SecretProvider(String secret) {
    this.secret = secret;
  }

  public String getSecret() {
    return secret;
  }
}
