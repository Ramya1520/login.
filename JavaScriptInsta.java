package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptInsta {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.javatpoint.com/");
		
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		WebElement scrollDown=driver.findElement(By.xpath("//h2[text()='Java Technology']"));
	
		
		jk.executeScript("arguments[0].scrollIntoView('true')",scrollDown);
		
		Thread.sleep(3000);
		WebElement scrollUp=driver.findElement(By.xpath("(//a[@target='_blank'])"));
		jk.executeScript("arguments[0].scrollIntoView('false')",scrollUp);
		
		
		
	
	
		
	
		
		
		
	}

}
