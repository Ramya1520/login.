package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownEx1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
//		WebElement day = driver.findElement(By.id("day"));
//		Select s=new Select(day);
//		
//		Thread.sleep(3000);
//		s.selectByIndex(3);
//		
//		Thread.sleep(3000);
//		WebElement month=driver.findElement(By.id("month"));
//		Select s3=new Select(month);
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select a=new Select(findElement);
		Thread.sleep(3000);
		
		List<WebElement> option = a.getOptions();
		System.out.println("print All Even options");
		for(int i=0;i<option.size();i++) {
			WebElement even = option.get(i);
			String text = even.getText();
			System.out.println(text);
			
		
			
		}
		
		List<WebElement> option1 = a.getOptions();
		System.out.println("print odd number");
		for(int i=1;i<option1.size();i=i+2) {
			WebElement odd=option1.get(i);
			String text = odd.getText();
			System.out.println(text);
		}
		int size=option.size();
		System.out.println("\nTotal Options:"+size);
		System.out.println("\n print the middle options");
		WebElement middle = option.get(size/2);
		String text = middle.getText();
		System.out.println(text);
		
		driver.close();
		
		
		
	}
	
	
	

}
