package org.login;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
//		WebElement pop = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		pop.click();
//		WebElement searchBar = driver.findElement(By.xpath("//input[@type='text']"));
//		searchBar.sendKeys("realme c35");
//		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
//		searchButton.click();
//		
//		Thread.sleep(5000);
//		WebElement mobile = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
//		mobile.click();
//		
//		//to get the parentid
//		Thread.sleep(5000);
//		String parId = driver.getWindowHandle();
//		Thread.sleep(5000);
//		Set<String> allIds = driver.getWindowHandles();
//		Thread.sleep(5000);
//		for (String n : allIds) {
//			
//			if(!parId.equals(n)) {
//				driver.switchTo().window(n);
//				Thread.sleep(5000);
//				WebElement getting = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
//				String text = getting.getText();
//				System.out.println(text);
//			}
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++) {
			WebElement individualRow = row.get(i);
			List<WebElement> column = individualRow.findElements(By.tagName("td"));
			for(int j=0; j<column.size(); j++) {
				WebElement individualColumn = column.get(j);
				String text = individualColumn.getText();
				System.out.println(text);	
			}
			
			
		
		}
			
		
		
		
		
		}
		
		
			
	
	}

