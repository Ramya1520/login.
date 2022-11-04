package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;



public class CanaraBankAlert {
	public static void main (String[]arg) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		WebElement signIn=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		signIn.click();
		
		
	// Alert alert=driver.switchTo().alert();
	// alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
