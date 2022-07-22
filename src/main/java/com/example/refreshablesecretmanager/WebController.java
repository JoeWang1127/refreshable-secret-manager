package com.example.refreshablesecretmanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WebController {
  private final SecretProvider secretProvider;
  private final SecretProvider2 secretProvider2;

  public WebController(SecretProvider secretProvider, SecretProvider2 secretProvider2) {
    this.secretProvider = secretProvider;
    this.secretProvider2 = secretProvider2;
  }

  @GetMapping("/getSecret")
  @ResponseBody
  public String getSecret() {
    // String secretId = secretProvider.getSecret();
    String secretId = secretProvider2.getSecret();
    return "Secret ID: "
        + HtmlUtils.htmlEscape(secretId)
        + " | Value: "
        + secretId
        + "<br/><br/><a href='/'>Go back</a>";
  }
}
