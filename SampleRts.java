package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleRts {
	public static void main (String[]args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        
        Robot a=new Robot();
        a.keyPress(KeyEvent.VK_G);
        a.keyRelease(KeyEvent.VK_G);
        a.keyPress(KeyEvent.VK_R);
        a.keyRelease(KeyEvent.VK_R);
        a.keyPress(KeyEvent.VK_E);
        a.keyRelease(KeyEvent.VK_E);
        a.keyPress(KeyEvent.VK_E);
        a.keyRelease(KeyEvent.VK_E);
        a.keyPress(KeyEvent.VK_N);
        a.keyRelease(KeyEvent.VK_N);
        
        
        a.keyPress(KeyEvent.VK_CONTROL);
        a.keyPress(KeyEvent.VK_A);
        a.keyRelease(KeyEvent.VK_CONTROL);
        a.keyRelease(KeyEvent.VK_A);
        a.keyPress(KeyEvent.VK_CONTROL);
        a.keyPress(KeyEvent.VK_C);
        a.keyRelease(KeyEvent.VK_CONTROL);
        a.keyRelease(KeyEvent.VK_C);
        
        a.keyPress(KeyEvent.VK_TAB);
        a.keyRelease(KeyEvent.VK_TAB);
        a.keyPress(KeyEvent.VK_CONTROL);
        a.keyPress(KeyEvent.VK_V);
        a.keyRelease(KeyEvent.VK_CONTROL);
        a.keyRelease(KeyEvent.VK_V);
        
        
        
        
        
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
