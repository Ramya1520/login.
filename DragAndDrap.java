package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrap {
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(3000);
	WebElement drag=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement drop=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	
                                                                                                                                                                                                                                                                                                                                                                                                         	
	WebElement drag1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement drop1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	
	
	WebElement drag2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	WebElement drop2=driver.findElement(By.id("loan"));
	
	
	WebElement drag3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
	WebElement drop3=driver.findElement(By.id("amt8"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(drag,drop).perform();
	act.dragAndDrop(drag1,drop1).perform();
	act.dragAndDrop(drag2,drop2).perform();
	act.dragAndDrop(drag1,drop3).perform();

}}
