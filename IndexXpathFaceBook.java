package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexXpathFaceBook {
	 public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement firstName=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		firstName.sendKeys("Ramya");
		
		WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("G");
		
		WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));	
		address.sendKeys("1,allikula street,madapuram,nagai");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		email.sendKeys("ramya.krishan1520@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		phone.sendKeys("6384358523");
		
		
		WebElement gender=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		gender.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
