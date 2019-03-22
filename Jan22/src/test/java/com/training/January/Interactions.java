package com.training.January;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions extends ReUsableFunctions
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.get("https://selenium-prd.firebaseapp.com/");
		System.out.println("Application Launch Successfully.");
		
		Thread.sleep(1000);
		WebElement UserName = driver.findElement(By.id("email_field"));
		EnterText(UserName, "admin123@gmail.com");
		
		Thread.sleep(1000);
		WebElement Password = driver.findElement(By.id("password_field"));
		EnterText(Password, "admin123");
		
		Thread.sleep(1000);
		WebElement Login = driver.findElement(By.xpath("//button[@onclick='login()']"));
		ClickObject(Login);

	}

}
