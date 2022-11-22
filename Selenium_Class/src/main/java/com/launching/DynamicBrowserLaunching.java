package com.launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicBrowserLaunching 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.w3school.com");
		
	
		//WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.edge.driver", "E:\\Drivers\\edgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.google.com");
		
		
	
	}

}
