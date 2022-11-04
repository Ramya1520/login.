package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFunction {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe ");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/create/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();	
        driver.navigate().to("https://www.flipkart.com/");
        driver.close();
	}

}
