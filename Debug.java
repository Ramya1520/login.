package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe ");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/create/");
	    WebElement createAccount=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	    createAccount.click();
	    
	    WebElement firstName=driver.findElement(By.name("firstname"));
	    firstName.sendKeys("Ramya");
	    
	    WebElement surName=driver.findElement(By.name("lastname"));
	    surName.sendKeys("G");
	    
	    WebElement email=driver.findElement(By.name("reg_email__"));
	    email.sendKeys("ramya.krishnan1520@gmail.com");
	    
	    WebElement reenterEmail=driver.findElement(By.name("reg_email_confirmation__"));
	    reenterEmail.sendKeys("ramya.krishnan1520@gmail.com");
	    
	    
	    WebElement newPassword=driver.findElement(By.id("password_step_input"));
	    newPassword.sendKeys("Ramya@123");
	    
	    WebElement date=driver.findElement(By.id("day"));
	    date.sendKeys("15");
	    Thread.sleep(3000);
	    WebElement month=driver.findElement(By.xpath("//Select[@aria-label='Month']"));
	    month.sendKeys("jun");
	    Thread.sleep(3000);
	    WebElement year=driver.findElement(By.id("year"));
	    year.sendKeys("2000");
	    
	    WebElement gender=driver.findElement(By.name("sex"));
	    gender.click();
	    Thread.sleep(3000);
	    WebElement signUp=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	    signUp.click();
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
