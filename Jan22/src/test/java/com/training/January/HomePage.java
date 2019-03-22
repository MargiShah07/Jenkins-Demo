//https://www.macminivault.com/mysql-yosemite/
//https://selenium-prd.firebaseapp.com/home.html
//admin123@gmail.com
//admin123
package com.training.January;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.util.Set;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{

	static ExtentReports extent;
	static ExtentTest homeTest;
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/HomExtentReport.html", true);
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 40);
		homeTest = extent.startTest("Launch Test");
		driver.get("https://selenium-prd.firebaseapp.com/");
		System.out.println("Application Launch Successfully.");
		
		Thread.sleep(5000);
		homeTest.log(LogStatus.PASS, "UserName entered succesfully");
		WebElement UserName = driver.findElement(By.id("email_field"));
		UserName.clear();
		UserName.sendKeys("admin123@gmail.com");
		System.out.println("UserName entered Successfully.");
		
		WebElement Password = driver.findElement(By.id("password_field"));
		Password.clear();
		Password.sendKeys("admin123");
		System.out.println("Password entered Successfully.");
		homeTest.log(LogStatus.PASS, "Password entered succesfully");
		
		WebElement Login = driver.findElement(By.xpath("//button[@onclick='login()']"));
		Login.click();
		System.out.println("Login button clicked.");
		homeTest.log(LogStatus.PASS, "Login button clicked succesfully");
		
		Thread.sleep(2000);
		WebElement HomePage = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		HomePage.click();
		System.out.println("HomePage Button clicked.");
		
		WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));
		Name.sendKeys("Margi");
		System.out.println("Name is entered.");
		
		WebElement FName = driver.findElement(By.xpath("//input[@id='lname']"));
		FName.sendKeys("Y");
		System.out.println("Father Name is entered.");
		
		WebElement PostalCode = driver.findElement(By.xpath("//input[@id='postaladdress']"));
		PostalCode.sendKeys("21542");
		System.out.println("Postalcode entered.");
		
		WebElement PersonalAdd = driver.findElement(By.xpath("//input[@id='personaladdress']"));
		PersonalAdd.sendKeys("123 Brukeway VA");
		System.out.println("Personal address enetered.");
		
		Thread.sleep(4000);
		WebElement GenderFemale = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[5]/span[2]/input[1]"));
		GenderFemale.click();
		System.out.println("RadioButton selected.");
		
		Select city = new Select(driver.findElement(By.name("city")));
		city.selectByValue("mumbai");
		System.out.println("city Mumbai is selected from dropdown");
		
		Select course = new Select(driver.findElement(By.name("course")));
		course.selectByValue("mba");
		System.out.println("course MBA is selected from dropdown.");
		
		Select districts = new Select(driver.findElement(By.id("district")));
		districts.selectByValue("patna");
		System.out.println("district PATNA is selected from dropdown.");
		
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByValue("btech");
		System.out.println("State NALANDA is selected from dropdown.");
		
		WebElement pincode = driver.findElement(By.id("pincode"));
		pincode.clear();
		pincode.sendKeys("42185");
		System.out.println("pincode entered.");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='emailid']"));
		Email.clear();
		Email.sendKeys("margishah59@yahoo.com");
		System.out.println("Email Address is enetered.");
		
		WebElement Submit = driver.findElement(By.xpath("//button[@class='bootbutton']"));
		Submit.click();
		System.out.println("Submit button is clicked.");
		
		System.out.println("Home Tab is completed...");
		
		WebElement SwitchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		SwitchTo.click();
		System.out.println("Switch To button is clicked.");
		
		WebElement Alert = driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		Alert.click();
		System.out.println("Alert Button is clicked.");
		
		WebElement WindowsAlert = driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		WindowsAlert.click();
		System.out.println("Window Alert is clicked.");
		Thread.sleep(4000);
		Alert windowsAlert = driver.switchTo().alert();
		String alertText=windowsAlert.getText();
		System.out.println("Alert Text is "+alertText);
		Thread.sleep(4000);
		windowsAlert.accept();
		
		WebElement PromtAlert = driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		PromtAlert.click();
		System.out.println("Promt Alert is clicked");
		
		Thread.sleep(4000);
		Alert promtAlert = driver.switchTo().alert();
		promtAlert.sendKeys("Margi");
		
		Thread.sleep(4000);
		promtAlert.accept();
		System.out.println("Promt Alert Name is entered.");		
		Thread.sleep(5000);

		WebElement SwitchTo1 = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		SwitchTo1.click();
		System.out.println("Switch To button is clicked.");
		
		WebElement windows = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
		windows.click();
		System.out.println("Windows Button is clicked.");
		
		WebElement OpenNewTab = driver.findElement(By.className("bootbutton"));
		OpenNewTab.click();
		System.out.println("Open New Tab is clicked.");
		
		Set<String> getAllWindows=driver.getWindowHandles();
		String[] window=getAllWindows.toArray(new String[getAllWindows.size()]);
		driver.switchTo().window(window[1]).close();
		System.out.println("New Tab closed.");
		
		//Thread.sleep(3000);
//		WebElement OpenNewWin = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/a[2]/button[1]"));
//		OpenNewWin.click();
//		System.out.println("Open New Window is clicked.");
//		
//		Set<String> getAllWindows1=driver.getWindowHandles();
//		String[] window1=getAllWindows1.toArray(new String[getAllWindows1.size()]);
//		driver.switchTo().window(window1[1]).close();
//		System.out.println("New Window closed.");
		
//		System.out.println("Switch To Tab is Completed...");
//		
//		WebElement Intractions = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
//		Intractions.click();
//		System.out.println("Intractions is clicked.");
//		
//		WebElement DragDrop = driver.findElement(By.xpath("//a[contains(text(),'Drag & Drop')]"));
//		DragDrop.click();
//		System.out.println("Drag And Drop button is clicked.");
		
		extent.endTest(homeTest);
		extent.flush();
		extent.close();
	}

}
