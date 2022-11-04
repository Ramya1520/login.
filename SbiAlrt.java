package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SbiAlrt {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		Thread.sleep(3000);
		WebElement ContinueToLogIn=driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		ContinueToLogIn.click();
		
		WebElement Login=driver.findElement(By.id("Button2"));
		Login.click();
		
		Alert alert3=driver.switchTo().alert();
		alert3.accept();
		
		
		
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
