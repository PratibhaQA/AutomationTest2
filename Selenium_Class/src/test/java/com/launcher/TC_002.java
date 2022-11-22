package com.launcher;

public class TC_002 extends BasicTest
{

	public static void main(String[] args) throws Exception
	{
		
		init();
		launch("chromebrowser");
		navigate("amazonurl");
           
		
		String title=driver.getTitle();
		System.out.println(title);
		//driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		
		
		//driver.findElement(null);
		//driver.getWindowHandle();
		//driver.close();
		//driver.quit();
	//	driver.getPageSource();
		
		//driver.getWindowHandles();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		driver.close();
		
		
		
	
	}

}
