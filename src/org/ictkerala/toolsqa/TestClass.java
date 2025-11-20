package org.ictkerala.toolsqa;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");
		
		String parentid=driver.getWindowHandle();
		WebElement page=driver.findElement(By.id("tabButton"));
		page.click();
		Set<String> handles=driver.getWindowHandles();
		for(String t:handles) {
			if(!t.equals(parentid)) {
				driver.switchTo().window(t);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
	}

}
