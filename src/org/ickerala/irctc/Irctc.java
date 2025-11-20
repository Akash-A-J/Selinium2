package org.ickerala.irctc;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irctc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctctourism.com/");
		WebElement bus=driver.findElement(By.xpath("//a[@title='Bus Tickets']"));
		String parentid=driver.getWindowHandle();
		bus.click();
		Set<String> handles=driver.getWindowHandles();
		for(String id:handles) {
			if(!id.equals(parentid)) {
				driver.switchTo().window(id);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		WebElement dep=driver.findElement(By.name("departFrom"));
		dep.sendKeys("Kollam");
		WebElement arr=driver.findElement(By.name("goingTo"));
		arr.sendKeys("Kochi");
		WebElement search=driver.findElement(By.xpath("//div[@class='form-in-custom3']/child::button"));
		search.click();
	}

}
