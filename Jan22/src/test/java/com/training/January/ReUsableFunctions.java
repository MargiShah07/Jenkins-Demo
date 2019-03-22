package com.training.January;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReUsableFunctions 
{
	static WebDriver driver;

	public static void EnterText(WebElement obj, String textVal) throws InterruptedException
	{
		if(obj.isDisplayed())
		{
			Thread.sleep(1000);
			obj.sendKeys(textVal);
			System.out.println("PASS: Value entered.");
		}
		else
		{
			System.out.println("FAIL: value didnot enter.");
		}
	}

	public static void ClickObject(WebElement obj) throws InterruptedException
	{
		if(obj.isDisplayed())
		{
			Thread.sleep(1000);
			obj.click();
			System.out.println("PASS: Button clicked.");
		}
		else
		{
			System.out.println("FAIL: Button didnot click.");
		}
	}
}
