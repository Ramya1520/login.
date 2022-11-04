package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		                    
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement userName=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','Raadfgmya')",userName); 
		
		Thread.sleep(3000);
		
		WebElement passWord=driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','Ramsdsfdghjya@123')",passWord);
		
		WebElement logIn=driver.findElement(By.xpath("//button[text()='Log In']"));
		js.executeScript("arguments[0].click()",logIn);
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-500)");
		
		
		
	}

}
