package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("Ramya");
		
		WebElement passWord=driver.findElement(By.id("pass"));
		passWord.sendKeys("Ramya@123");
		
		driver.findElement(By.id("loginbutton"));
		
		WebElement logIn=driver.findElement(By.id("loginbutton"));
		logIn.click();
		
		
		
		
		
		
		
		
		                                                                                                                                                                                                                          
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
