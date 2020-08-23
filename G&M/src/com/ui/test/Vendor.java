package com.ui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Vendor extends LoginPage2
{
	 @Test
     public void SelectcreateVendoreFromDropdown() 
	 {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[text()='Administration']")).click();
		 driver.findElement(By.xpath("//a[text()='Vendors']")).click();
		 //driver.findElement(By.xpath("//a[text()='Create Vendor']")).click();
		 driver.findElement(By.xpath("//a[text()='Vendors List']")).click();
	 }
	 
}
