package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class emp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.229852315.668541358.1628356750-1241069950.1628356750");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@style='margin-right:18px;']")).click();
		
		

	}
		

}
