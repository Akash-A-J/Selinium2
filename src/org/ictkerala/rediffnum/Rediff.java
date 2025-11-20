package org.ictkerala.rediffnum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame("moneyiframe");
		WebElement num=driver.findElement(By.id("nseindex"));
//		driver.switchTo().parentFrame();
		System.out.println(num.getText());

	}

}
