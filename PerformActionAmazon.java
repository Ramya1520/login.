package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformActionAmazon {
public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumExample\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=amazin+in&adgrpid=115215853359&gclid=Cj0KCQjw852XBhC6ARIsAJsFPN3RgVKA_y1mEjfrhRUtQELTGYz1zvIZTrCg-VGtVXBapLDDm1iz2OIaAu6fEALw_wcB&hvadid=590245029515&hvdev=c&hvlocphy=1007809&hvnetw=g&hvqmt=b&hvrand=11718329203738091632&hvtargid=kwd-311187673435&hydadcr=10065_2128766&tag=googinhydr1-21&ref=pd_sl_slgzi2343_b");
		WebElement acc=driver.findElement(By.id("nav-link-accountList"));
		Actions act=new Actions(driver);
		act.moveToElement(acc).perform();
		//WebElement homeProdect=driver.findElement(By.xpath("//div[@class='eFQ30H'][9]"));
		//Actions act=new Actions(driver);
		//act.moveToElement(homeProdect).perform()

}
}