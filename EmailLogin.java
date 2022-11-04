package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailLogin {
	public static void main (String[]arg) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/accountchooser/signinchooser?flowName=GlifWebSignIn&flowEntry=AccountChooser");
	    WebElement anotherAccount=driver.findElement(By.xpath("(//div[@class='lCoei YZVTmd SmR8'])[2]"));
	    anotherAccount.click();
	    WebElement emailId=driver.findElement(By.xpath("//input[@autocomplete='username']"));
	    emailId.sendKeys("ramya.krishnan1520@gmail.com");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
