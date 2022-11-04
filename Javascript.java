

package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe   ");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		//jk.executeScript("window.scrollBy(0,500)");
		
		//Thread.sleep(3000);
		//jk.executeScript("window.scrollBy(0,-500)");
		
		WebElement scrollDown=driver.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));
		jk.executeScript("arguments[0].scrollIntoView(true)",scrollDown);
		
		Thread.sleep(3000);
		WebElement scrollUp=driver.findElement(By.xpath("//font[contains(text(),'We')] "));
		jk.executeScript("arguments[0].scrollIntoView(false)",scrollUp);
		
		
	
	}
 
}

	
