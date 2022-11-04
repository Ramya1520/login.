package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformActionAmazonLanguageSelection {
public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement course=driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
		Actions act=new Actions(driver);
		act.moveToElement(course).perform();
	

} 
	

}
