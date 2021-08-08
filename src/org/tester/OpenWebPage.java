package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997\\r\\n\" + \r\n" + 
				"				\"");
		WebElement a = driver.findElement(By.xpath("//img[@style=\"margin-right:18px;\"]"));
		a.click();
		
		
		
	}
	

}
