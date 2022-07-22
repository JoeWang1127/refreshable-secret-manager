package com.example.refreshablesecretmanager;

import com.google.cloud.spring.secretmanager.SecretManagerOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WebController {
  private final SecretManagerOperations secretManagerOperations;
  private final SecretProvider secretProvider;
  private final SecretProvider2 secretProvider2;

  public WebController(
      SecretManagerOperations secretManagerOperations,
      SecretProvider secretProvider,
      SecretProvider2 secretProvider2) {
    this.secretManagerOperations = secretManagerOperations;
    this.secretProvider = secretProvider;
    this.secretProvider2 = secretProvider2;
  }

  @GetMapping("/getSecret")
  @ResponseBody
  public String getSecret() {
    // String secret = secretManagerOperations.getSecretString(secretProvider.getSecretId());
    String secret = secretManagerOperations.getSecretString(secretProvider2.getSecretId());
    return "Secret ID: "
        + HtmlUtils.htmlEscape(secret)
        + " | Value: "
        + secret
        + "<br/><br/><a href='/'>Go back</a>";
  }
}
