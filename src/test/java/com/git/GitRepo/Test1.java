package com.git.GitRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void launch() {
	  System.setProperty("webdriver.chrome.driver","D:\\amma\\ChromeDriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
  }
}
