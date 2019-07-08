package com.cybertek;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NG1Basics {
	WebDriver driver;
	
	
	@Test (priority = 1)
	public void Test2() {
		
		driver.findElement(By.name("q")).sendKeys("TestNG");
		driver.findElement(By.name("btnK")).click();
	}
	
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
}
