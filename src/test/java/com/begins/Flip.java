package com.begins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("deepthideepakm@gmail.com");
		driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("manager");
		driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
		WebElement error=driver.findElement(By.cssSelector("._2YULOR"));
		Assert.assertEquals(error,"Your username or password is incorrect");
		
	}

}
