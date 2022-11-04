package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformActionGreenstech {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		WebElement course=driver.findElement(By.xpath("//div[@title='Courses']"));
		Actions act=new Actions(driver);
		act.moveToElement(course).perform();
		WebElement testing=driver.findElement(By.xpath("//p[@class='course-desc']"));
		act.moveToElement(testing).perform();
	}

}
