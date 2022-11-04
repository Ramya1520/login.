package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformActionGreens {
public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement course=driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		Actions act=new Actions(driver);
		act.moveToElement(course).perform();
		
		WebElement mastersCourse=driver.findElement(By.xpath("//div[@title='Master Program']"));
		
		act.moveToElement(mastersCourse).perform();
}
}
