package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformActionFlipkart {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement reload=driver.findElement(By.id("reload-button"));
		reload.click();
		
		WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		WebElement homeProdect=driver.findElement(By.xpath("//div[@class='eFQ30H'][9]"));
		Actions act=new Actions(driver);
		act.moveToElement(homeProdect).perform();
		//WebElement bathTowel=driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		//act.moveToElement(bathTowel).perform();
		
	}

}
