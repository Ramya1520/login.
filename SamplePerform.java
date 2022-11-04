package org.login;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SamplePerform {
	public static void main(String[]args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/Register.php");
		WebElement  userName=driver.findElement(By.id("username"));
		userName.sendKeys("Ramya123");
		WebElement emailId=driver.findElement(By.id("email_add"));
		emailId.sendKeys("ramya.krishnan1520@gmailcom");
		Actions act=new Actions(driver);
		act.doubleClick(userName).perform();
		act.contextClick(userName).perform();
		
		Robot detail=new Robot();
		detail.keyPress(KeyEvent.VK_DOWN);
		detail.keyRelease(KeyEvent.VK_DOWN);
		
		detail.keyPress(KeyEvent.VK_DOWN);
		detail.keyRelease(KeyEvent.VK_DOWN);
		
		detail.keyPress(KeyEvent.VK_DOWN);
		detail.keyRelease(KeyEvent.VK_DOWN);
		
		detail.keyPress(KeyEvent.VK_ENTER);
		detail.keyPress(KeyEvent.VK_ENTER);
		 
		detail.keyPress(KeyEvent.VK_TAB);
		detail.keyRelease(KeyEvent.VK_TAB);
		
		detail.keyPress(KeyEvent.VK_CONTROL);
		detail.keyPress(KeyEvent.VK_V);
		
		detail.keyRelease(KeyEvent.VK_CONTROL);
		detail.keyRelease(KeyEvent.VK_V);
		
		detail.keyPress(KeyEvent.VK_CONTROL);
		detail.keyPress(KeyEvent.VK_C);
		
		detail.keyRelease(KeyEvent.VK_CONTROL);
		detail.keyRelease(KeyEvent.VK_C);
		
		detail.keyPress(KeyEvent.VK_TAB);
		detail.keyRelease(KeyEvent.VK_TAB);
		
		detail.keyPress(KeyEvent.VK_CONTROL);
		detail.keyPress(KeyEvent.VK_V);
		
		detail.keyRelease(KeyEvent.VK_CONTROL);
		detail.keyRelease(KeyEvent.VK_V);
		
		detail.keyPress(KeyEvent.VK_TAB);
		detail.keyRelease(KeyEvent.VK_TAB);
		
		
		
				
		detail.keyPress(KeyEvent.VK_SHIFT);
		
		
		
		
		detail.keyPress(KeyEvent.VK_R);
		
		detail.keyRelease(KeyEvent.VK_R);
		

		detail.keyRelease(KeyEvent.VK_SHIFT);
		
		detail.keyPress(KeyEvent.VK_A);
		detail.keyRelease(KeyEvent.VK_A);
		
		detail.keyPress(KeyEvent.VK_M);
		detail.keyRelease(KeyEvent.VK_M);
		
		detail.keyPress(KeyEvent.VK_Y);
		detail.keyRelease(KeyEvent.VK_Y);
		
		detail.keyPress(KeyEvent.VK_A);
		detail.keyRelease(KeyEvent.VK_A);
		
		detail.keyPress(KeyEvent.VK_SPACE);
		detail.keyRelease(KeyEvent.VK_SPACE);
		

		detail.keyPress(KeyEvent.VK_SHIFT);
		
		detail.keyPress(KeyEvent.VK_G);
		detail.keyRelease(KeyEvent.VK_G);

		detail.keyRelease(KeyEvent.VK_SHIFT);
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
