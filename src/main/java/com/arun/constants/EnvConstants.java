package com.arun.constants;

import java.util.HashMap;
import java.util.Map;

public class EnvConstants {
  private String homePageUrl;
  private Map<String,String> envConstants = new HashMap<String, String>();
  
  public Map<String, String> setConstants() {
    getEnvValues();
    initializeConstants();
    return envConstants;
  }
  
  public void getEnvValues() {
    if (System.getenv("env") == "test") {
      homePageUrl = "http://www.yahoo.com";
    }
    else if (System.getenv("env") == "prod") {
      homePageUrl = "http://www.google.com";
    }
    else {
      homePageUrl = "http://www.arun.com";
    }
  }
  
  public void initializeConstants() {
    envConstants.put("homePageUrl", homePageUrl);
  }
  
  public static void main(String args[]) {
    System.out.println(new EnvConstants().setConstants().get("homePageUrl"));
  }
  
}


  
  
  
