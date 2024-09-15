package com.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Amount_Transfer extends parabank_Register {
	@Test(priority = 4)
	public void transferfund() {
	WebElement fund=ob.findElement(By.cssSelector("a[href='transfer.htm']"));
	fund.click();
	
	WebElement amt1=ob.findElement(By.id("amount"));
	amt1.sendKeys("300");
	
	
	WebElement sumbtn=ob.findElement(By.cssSelector("input[type='submit']"));
	sumbtn.click();
	
	System.out.println(ob.getTitle());
	}
	
	

}
