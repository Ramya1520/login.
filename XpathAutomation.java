package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAutomation {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("Ramya");
		
		WebElement passWord=driver.findElement(By.xpath("//input[@aria-label='Password']"));
		passWord.sendKeys("Ramya@123");
		
		WebElement logIn=driver.findElement(By.xpath("//button[@value='1']"));
		logIn.click();
	}

}
