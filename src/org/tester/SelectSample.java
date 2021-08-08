package org.tester;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.xpath("//select[@aria-label='நாள்']"));
		Select sel=new Select(date);
		sel.selectByValue("9");
		
		List<WebElement> all = sel.getOptions();
		for (int i = 0; i < all.size(); i++) {
			WebElement ele = all.get(i);
			String text = ele.getText();
			
			System.out.println(text);
			
		}
		
	}

}
