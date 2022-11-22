package com.launching;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowsreLaunch 
{

	public static void main(String[] args)
	{
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "")
		ChromeDriver obj = new ChromeDriver();
		
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver obj1 = new FirefoxDriver();
		
		WebDriverManager.iedriver().setup();
		InternetExplorerDriver obj3 = new InternetExplorerDriver();

	}

}
