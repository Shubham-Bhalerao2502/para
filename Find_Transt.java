package com.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Find_Transt extends pay_Bill {
	
	@Test(priority = 6)
	public void Transaction()
	{
		WebElement findtranbtn=ob.findElement(By.cssSelector("a[href='findtrans.htm']"));
		findtranbtn.click();
		
		WebElement byamt=ob.findElement(By.id("amount"));
		byamt.sendKeys("300");
		
		WebElement btn3=ob.findElement(By.id("findByAmount"));
		btn3.click();
		
		System.out.println(ob.getTitle());
	}

}
