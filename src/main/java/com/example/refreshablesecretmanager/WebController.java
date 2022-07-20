package com.example.refreshablesecretmanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WebController {
  private final SecretProvider secretProvider;

  public WebController(SecretProvider secretProvider) {
    this.secretProvider = secretProvider;
  }

  @GetMapping("/getSecret")
  @ResponseBody
  public String getSecret() {
    String secretId = secretProvider.getSecret();
    return "Secret ID: "
        + HtmlUtils.htmlEscape(secretId)
        + " | Value: "
        + secretId
        + "<br/><br/><a href='/'>Go back</a>";
  }
}
