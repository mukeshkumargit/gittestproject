package com.mukesh.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SeleniumJavaTEST_001 {

	public static void main(String[] args) {

//		    @Test
//		    public void login() {
		// TODO Auto-generated method stub

//		        System.setProperty("webdriver.chrome.driver", "path of driver");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();

//		        WebElement username=driver.findElement(By.id("username"));
//		        WebElement password=driver.findElement(By.id("password"));
////		        WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
//		        
//		        username.sendKeys("example@gmail.com");
//		        password.sendKeys("password");
//		        login.click();
//		        
//		        String actualUrl="https://www.linkedin.com/feed/";
//		        String expectedUrl= driver.getCurrentUrl();
//		        
//		        Assert.assertEquals(expectedUrl,actualUrl);

	}

}
