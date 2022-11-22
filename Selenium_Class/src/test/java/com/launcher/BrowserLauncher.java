package com.launcher;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLauncher {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", null);
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver obj1 = new FirefoxDriver();
		
	
		// webdriver.gecko.driver       (for firefox browser Launching)
		//webdriver.edge.driver         ( for internet explorer browser launching)
		

	}

}
