package com.arun.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
  
  private String browserNameProperty = "browserName";
  private String browserName = System.getProperty(browserNameProperty);
  
  public WebDriver open() {
    
    boolean isBrowserPropertySet = (browserName == null) ? false : true;
    
    if (!isBrowserPropertySet) {
      setDefaultBrowser();
    }
 
    switch(System.getProperty(browserNameProperty).trim().toLowerCase()) {
    case "firefox":
      WebDriverManager.firefoxdriver().setup();
      return new FirefoxDriver();
    case "edge":
      WebDriverManager.edgedriver().setup();
      return new EdgeDriver();
    case "chrome":
    default:
      WebDriverManager.chromedriver().setup();
      return new ChromeDriver();
    
    }
  }
  
  public void setDefaultBrowser() {
    setBrowser("default");
  }
  
  public void setBrowser(String browserName) {
    System.setProperty(browserNameProperty, browserName);
  }
  
  public static void main(String args[]) {
    new DriverManager().open().get("http://www.yahoo.com");
  }

}
