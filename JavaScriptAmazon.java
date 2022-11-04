package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.definitions.net/definition/infomation");
		
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		
		
		
		//jk.executeScript("window.scrollBy(0,500)");
		//Thread.sleep(3000);
		//jk.executeScript("window.scrollBy(0,-500)");
		
		Thread.sleep(3000);
		
	    WebElement scrollDown=driver.findElement(By.xpath("//*[@id=\"content-body\"]/div[1]/div[6]/div/div/div[2]/div/button"));
		jk.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		
		Thread.sleep(5000);
		
		WebElement scrollUp=driver.findElement(By.id("user-login"));
		jk.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
		
		
	
	
	
	}

}
