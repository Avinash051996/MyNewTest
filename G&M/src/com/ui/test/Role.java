package com.ui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Role extends LoginPage2
{
	
	 @Test(priority = 3)
    public void CreateRole() throws InterruptedException 
	 {
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 //Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[text()='Administration']")).click();
		 driver.findElement(By.xpath("//a[text()='Roles & Privileges']")).click();
		 driver.findElement(By.xpath("//a[text()='Roles']")).click();
		 driver.findElement(By.xpath("//body//p-table//button[1]")).click();
		 driver.findElement(By.id("RoleName")).sendKeys("AutoRole1");
		 driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

	 }
	 
	 @Test(priority = 4)
	 public void EditRole() throws InterruptedException {
		
		 driver.findElement(By.xpath("//body/app-dashboard/div/main/div/app-roles/div/div/div/div/div/p-table/div/div/form/div/div/form/input[1]")).sendKeys("AutoRole1");
		 Thread.sleep(2000);
		 WebElement Edit = driver.findElement(By.xpath("//tr[1]//td[2]//i[3]"));
		 Edit.click();
		 WebElement RolesName = driver.findElement(By.id("RoleName"));
		 RolesName.click();
		 RolesName.clear();
		 RolesName.sendKeys("AutoRole2");
		 driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	 }
	 
	 @Test(priority = 5)
	 public void Delete() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//body/app-dashboard/div/main/div/app-roles/div/div/div/div/div/p-table/div/div/form/div/div/form/input[1]")).sendKeys("AutoRole2");
		 Thread.sleep(2000); 
		 WebElement DeleteRole = driver.findElement(By.xpath("//tr[1]//td[2]//i[4]"));
		 DeleteRole.click();
		 driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
	        // Switching to Alert        
	        /*Alert alert = driver.switchTo().alert();		
	        		
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        		
	        // Accepting alert		
	        alert.accept(); */
		 
	 }
}
