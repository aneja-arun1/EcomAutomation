package com.arun.tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.arun.driver.DriverManager;


public class TestPurchaseFlow {
  
  private WebDriver driver;
  private String homePageUrl;

  @BeforeClass
  public void setUp() {
    driver = new DriverManager().open();
    //driver.get(homePageUrl);
    
  }
  
  @Test
  public void makePayment() {
    System.out.println("Hello");
  }
  
  @AfterClass
  public void tearDown() {
    if(driver != null) {
      driver.quit();
    }
  }
  
}
