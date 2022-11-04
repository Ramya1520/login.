package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsUsingTextAndAttribute {
	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalapptesting.com/blog/what-is-automation-testing");
		
		driver.manage().window().maximize();
		
		//to print current url of webpage
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title=driver.getTitle();
		System.out.println(title);

		WebElement text=driver.findElement(By.xpath("//h2[text()='What is automation testing?']"));
		String attribute=text.getText();
		System.out.println(attribute);
		
		WebElement para=driver.findElement(By.xpath("//p[contains(text(),'Nowadays')]"));
		String attribute2=para.getText();
		System.out.println(attribute2);
		driver.close();
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/login/");
		
		WebElement userName=driver1.findElement(By.id("email"));
		userName.sendKeys("ramya.23@gmail.com");
		
		String attribute3=userName.getAttribute("value");
		System.out.println(attribute3);
		
		String attribute4=userName.getAttribute("id");
		System.out.println(attribute4);
		
		driver.close();
		
		
		
	}

}
