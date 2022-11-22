package com.launcher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest
{
	 public static WebDriver driver ;
	 
	 public static String projectpath= System.getProperty("user.dir");
	 public static  Properties p;
	 
	 
	 public static void init() throws Exception
	 {
		 

		// FileInputStream fis = new FileInputStream("E:\\Java workspace\\Selenium_Class\\src\\main\\resources\\data.properties");
		
		
		 FileInputStream fis = new FileInputStream(projectpath+"\\src\\main\\resources\\data.properties");
		p = new Properties();
		 p.load(fis);
		 String e = p.getProperty("chromebrowser");
		 System.out.println(e);
		 
	 }

	public static void launch(String browser) 
	{
		if(p.getProperty(browser).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(p.getProperty(browser).equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}else if(p.getProperty(browser).equals("ie")){
			
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}

	}
	public  static void navigate(String url)
	{
		driver.get(p.getProperty(url));
		
	}

}
