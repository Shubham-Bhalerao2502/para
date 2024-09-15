package com.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class parabank_Register {
	WebDriver ob;
	@Test(priority = 1)
	public void setup()	
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/abc/eclipse-workspace/codnera/para/src/test/resources/Drivers/chromedriver.exe"); 
		ob = new ChromeDriver();
		ob.manage().window().maximize();
		
	}
	@Test(priority = 2)
	public void info() throws InterruptedException
	{
		ob.get("https://parabank.parasoft.com/parabank/register.htm");
		WebElement Fname=ob.findElement(By.id("customer.firstName"));
		
		WebElement Lname=ob.findElement(By.id("customer.lastName"));
		
		WebElement add=ob.findElement(By.id("customer.address.street"));
		
		WebElement city=ob.findElement(By.id("customer.address.city"));
		
		WebElement state=ob.findElement(By.id("customer.address.state"));
		
		WebElement pin=ob.findElement(By.id("customer.address.zipCode"));
		
		WebElement mob=ob.findElement(By.id("customer.phoneNumber"));
		
		WebElement ssn=ob.findElement(By.id("customer.ssn"));
		
		WebElement Uname=ob.findElement(By.id("customer.username"));
		
		WebElement pass=ob.findElement(By.id("customer.password"));
		
		WebElement con=ob.findElement(By.id("repeatedPassword"));
		
		
		Fname.sendKeys("shubham");
		Lname.sendKeys("Bhalerao");
		add.sendKeys("Tingrenagar");
		city.sendKeys("Pune");
		state.sendKeys("Maharashtra");
		pin.sendKeys("411032");
		mob.sendKeys("9130071006");
		ssn.sendKeys("1234");
		Uname.sendKeys("Shubh5");
		pass.sendKeys("2502");
		con.sendKeys("2502");
		
		Thread.sleep(2000);
		WebElement ResigBtn=ob.findElement(By.xpath("//input[@value='Register']"));
		ResigBtn.click();
	}
	
	@Test(priority = 3)
	public void verify()
	{
		System.out.println(ob.getTitle());
	}


}
