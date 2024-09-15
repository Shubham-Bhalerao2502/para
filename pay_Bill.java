package com.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class pay_Bill extends Amount_Transfer {
	
	@Test(priority = 5)
	public void BillPay()
	{
	
		WebElement btn=ob.findElement(By.cssSelector("a[href='billpay.htm']"));
		btn.click();
		
		WebElement payNme=ob.findElement(By.name("payee.name"));
		payNme.sendKeys("Leo");
		
		WebElement Address=ob.findElement(By.name("payee.address.street"));
		Address.sendKeys("Bhalerao");
		
		WebElement City=ob.findElement(By.name("payee.address.city"));
		City.sendKeys("Pune");
		
		WebElement State=ob.findElement(By.name("payee.address.state"));
		State.sendKeys("Maharashtra");
		
		WebElement Zipcode=ob.findElement(By.name("payee.address.zipCode"));
		Zipcode.sendKeys("411032");
		
		WebElement Phone=ob.findElement(By.name("payee.phoneNumber"));
		Phone.sendKeys("9130071006");
		
		WebElement Acct=ob.findElement(By.name("payee.accountNumber"));
		Acct.sendKeys("25022");
		
		WebElement VerfyAcct=ob.findElement(By.name("verifyAccount"));
		VerfyAcct.sendKeys("25022");
		
		WebElement amt=ob.findElement(By.name("amount"));
		amt.sendKeys("300");
		
		WebElement btn1=ob.findElement(By.cssSelector("input[class='button']"));
		btn1.click();
		
		System.out.println(ob.getTitle());
	}

}
