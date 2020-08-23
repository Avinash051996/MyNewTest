package com.ui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Template extends UserModule {
	
	 @Test(priority = 7)
	    public void CreateTemplate() {
		 
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//a[text()='Templates']")).click();
		 driver.findElement(By.xpath("//a[text()='Create Template']")).click();
	 }
	 
	 @Test(priority = 8)
	    public void CreateTemplateGPC() {
		 
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//input[@id='templateName']")).sendKeys("AutoTestGPC");
		 
		 
	 }

}
