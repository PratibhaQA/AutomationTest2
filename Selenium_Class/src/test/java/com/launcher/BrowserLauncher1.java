package com.launcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLauncher1 {

	public static void main(String[] args) 
	{
		
       WebDriver driver;
      
      // WebDriverManager.chromedriver().setup();
       System.setProperty("webdriver.chrome.driver", "E:\\Java workspace\\Selenium_Class\\src\\main\\resources\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.get("https://www.amazon.in");
       
      //WebDriverManager.firefoxdriver().setup();
       System.setProperty("webdriver.gecko.driver", "E:\\Java workspace\\Selenium_Class\\src\\main\\resources\\geckodriver.exe");
       driver =new FirefoxDriver();
       driver.get("https://www.google.com");
       
       
	}

}
