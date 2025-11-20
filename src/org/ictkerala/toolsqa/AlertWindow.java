package org.ictkerala.toolsqa;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicite wait
		driver.get("https://demoqa.com/alerts");
		WebElement page=driver.findElement(By.id("alertButton"));
		page.click();
		//driver.switchTo().alert().accept();
		Alert obj=wait.until(ExpectedConditions.alertIsPresent());//explicite wait
		obj.accept();

	}

}
