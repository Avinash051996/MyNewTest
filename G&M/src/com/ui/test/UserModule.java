package com.ui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserModule extends Role {
	
	 @Test(priority = 6)
	    public void VerifyUserModule() throws InterruptedException{
		 
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 //Thread.sleep(5000);
		 //driver.findElement(By.xpath("//a[text()='Administration']")).click();
		 //driver.findElement(By.xpath("//a[text()='Roles & Privileges']")).click();
		 driver.findElement(By.xpath("//a[text()='User Module]")).click();
		 Thread.sleep(1000);
		 Select SelectUser = new Select(driver.findElement(By.id("user")));
		 //Country.selectByIndex(1);
		 SelectUser.selectByVisibleText("avinash@petras.in");
		 
		 String ExpectedUserRoleName = "SuperAdmin";
		 System.out.println("Expected User Role Name is : "+ExpectedUserRoleName);
		 String ActualUserRoleName = driver.findElement(By.xpath("//input[@name='role']")).getText();
		 System.out.println("Expected User Role is :"+ActualUserRoleName);
		 try {
			 Assert.assertEquals(ActualUserRoleName, ExpectedUserRoleName);
			 System.out.println("User Role is Correct");
		 }
		 catch(Throwable e){
			 System.out.println("User Role is InCorrect");
			 
		 }
	 }

}
