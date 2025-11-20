package org.ickerala.irctc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bus.irctc.co.in/home");
//		WebElement bus=driver.findElement(By.xpath("//a[@title='Bus Tickets']"));
//		bus.click();
		System.out.println(driver.getCurrentUrl());
		WebElement dep=driver.findElement(By.name("departFrom"));
		dep.sendKeys("Kollam");
		WebElement ar=driver.findElement(By.name("goingTo"));
		ar.sendKeys("Kochi");
		WebElement srh=driver.findElement(By.xpath("//div[@class='form-in-custom3']/child::button"));
		srh.click();
		
		
		

	}

}
