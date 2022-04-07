package com.begins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flip {
	
	@Test
	public void kart()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Bro\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.className("_2doB4z")).click();
        driver.findElement(By.className("_3704LK")).sendKeys("Iphone"+ Keys.ENTER);
        WebElement women=driver.findElement(By.cssSelector("div[class='_1kidPb']>:nth-child(4)"));
        Actions builder=new Actions(driver);
        builder.moveToElement(women).click().build().perform();
        
		
	}

}
