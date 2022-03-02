package com.begins;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticePage {
	
	@Test
	public void page()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Bro\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='secondary-button small-link']")).click();
		driver.findElement(By.linkText("Proceed to www.rahulshettyacademy.com (unsafe)")).click();
	List	<WebElement> radio=driver.findElements(By.name("radioButton"));
	for(int i=0;i<radio.size();i++)
	{
		
		radio.get(1).click();
	}
	
	
	driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("India");
	WebElement drop=driver.findElement(By.id("dropdown-class-example"));
	Select s=new Select(drop);
	s.selectByValue("option3");
	List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<check.size();i++)
	{
		check.get(2).click();
	}
	driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
	Set<String> id=driver.getWindowHandles();
	Iterator<String> ids=id.iterator();
	String fid=ids.next();
	String sid=ids.next();
	driver.switchTo().window(sid);
	String title=driver.getTitle();
	Assert.assertEquals(title, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
	
		
	}

}
