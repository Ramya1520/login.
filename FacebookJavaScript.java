package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookJavaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webmail.au.syrahost.com/");
		
		JavascriptExecutor jk=( JavascriptExecutor)driver;
		
		WebElement userName=driver.findElement(By.id("login"));
		jk.executeScript("arguments[0].setAttribute('value','ramya.krishnan1520@mail.com')",userName);
		
		
		WebElement password=driver.findElement(By.id("password"));
		jk.executeScript("arguments[0].setAttribute('value','Ramya.@123')", password);
		
		
		WebElement signIn=driver.findElement(By.id("sign_in"));
		jk.executeScript("arguments[0].click()",signIn);
		
		
		
		
		
		
		
		
		
		
	

	
		
	}

}
