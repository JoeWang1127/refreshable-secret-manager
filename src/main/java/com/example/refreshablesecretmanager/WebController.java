package com.example.refreshablesecretmanager;

import com.google.cloud.spring.secretmanager.SecretManagerOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WebController {
  private final SecretProvider secretProvider;
  private final SecretManagerOperations secretManager;

  public WebController(SecretProvider secretProvider, SecretManagerOperations operations) {
    this.secretProvider = secretProvider;
    this.secretManager = operations;
  }

  @GetMapping("/getSecret")
  @ResponseBody
  public String getSecret() {
   // String secretId = secretManager.getSecretString(secretProvider.getSecret());
    String secret = secretProvider.getSecret();
    return "Secret ID: "
        + HtmlUtils.htmlEscape(secret)
        + " | Value: "
        + secret
        + "<br/><br/><a href='/'>Go back</a>";
  }
}
