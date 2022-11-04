package org.login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlrt {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement AlertWithOk=driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		AlertWithOk.click();
		WebElement AlertBox=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		AlertBox.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		WebElement AlertWithOkAndCancel=driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		AlertWithOkAndCancel.click();
		Thread.sleep(3000);
		WebElement AlertBox1=driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		AlertBox1.click();
		//Alert alert1=driver.switchTo().alert();
		alert.dismiss();
	    
		
		WebElement AlertWithText=driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		AlertWithText.click();
		WebElement AlertBox3=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		AlertBox3.sendKeys("Thats Fine");
		//Alert alert2=driver.switchTo().alert();
		alert.accept();
		
		

   
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
