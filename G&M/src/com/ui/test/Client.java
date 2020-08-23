package com.ui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Client extends LoginPage2 
{
	
	 @Test(priority = 3)
     public void CreateClient() throws InterruptedException 
	 {
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 //Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[text()='Administration']")).click();
		 //driver.findElement(By.xpath("//a[text()='Administration']")).click();
		 
		 /*
		 WebDriverWait wait=new WebDriverWait(driver, 100);
		 WebElement AdministrationClick;
		 AdministrationClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Administration']")));
		 AdministrationClick.click();
		 **/
		 //driver.findElement(By.linkText("Administration")).click();
		 driver.findElement(By.xpath("//a[text()='Clients']")).click();
		 driver.findElement(By.xpath("//a[text()='Create Client']")).click();
		 driver.findElement(By.id("name")).sendKeys("AutomationRun1");
		 driver.findElement(By.id("description")).sendKeys("Desc1");
		 //Select Business Tygpe FRom DropDown
		 Select BusinessType = new Select(driver.findElement(By.id("BusinessType")));
		 BusinessType.selectByVisibleText("Manufacturer");
		 driver.findElement(By.id("CMSFedId")).sendKeys("CMS01");
		 driver.findElement(By.id("StateID")).sendKeys("MA01");
		 driver.findElement(By.id("MNStateID")).sendKeys("MN01");
		 driver.findElement(By.id("Address1")).sendKeys("Address001");
		 driver.findElement(By.id("address2")).sendKeys("Address2");
		 
		 Select Country = new Select(driver.findElement(By.xpath("//select[@id='Country']")));
		 //Country.selectByIndex(1);
		 Country.selectByVisibleText("US");
		 
		 Select State = new Select(driver.findElement(By.xpath("//select[@id='State']")));
		 //State .selectByIndex(1);
		 State.selectByVisibleText("Alaska");
		 driver.findElement(By.id("city")).sendKeys("Miami");
		 driver.findElement(By.id("postalCode")).sendKeys("12345");		
		 driver.findElement(By.id("website")).sendKeys("automation");
		 driver.findElement(By.id("comments")).sendKeys("Comments");
	     //This will scroll the web page till end.
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	     
	     driver.findElement(By.xpath("//button[contains(@class,'pull-right')]")).click();
	     driver.findElement(By.xpath("//td[1]//input[1]")).sendKeys("GM");
	     driver.findElement(By.xpath("//td[2]//input[1]")).sendKeys("Health");
	     driver.findElement(By.xpath("//td[3]//input[1]")).sendKeys("Mr");


	     //driver.findElement(By.xpath("//span[contains(@class,'mat-select-placeholder ng-tns-c1-0 ng-star-inserted')]")).click();
	     //driver.findElement(By.xpath("//span[contains(text(),'Operations')]")).click();

	     //WebElement ContactTypeDD =  driver.findElement(By.id("//td[4]"));
	     //Select ContactType = new Select(ContactTypeDD);
	     //Select ContactType = new Select(driver.findElement(By.className("Select ContactType = new Select(driver.findElement(By.id(\"//span[contains(text(),'Type')]\")));")));
	     //ContactType .selectByIndex(1);
	     
	     driver.findElement(By.xpath("//td[5]//input[1]")).sendKeys("avinash@petras.in");
	     driver.findElement(By.xpath("//td[6]//input[1]")).sendKeys("1023456789");
	     driver.findElement(By.xpath("//td[7]//input[1]")).sendKeys("1023456789");
	     driver.findElement(By.xpath("//option[contains(text(),'VPL')]")).click();
	     driver.findElement(By.xpath("//button[contains(text(),'>>')]")).click();
	     driver.findElement(By.xpath("//option[contains(text(),'NPPES')]")).click();
	     driver.findElement(By.xpath("//button[contains(text(),'>>')]")).click();
	     //driver.findElement(By.xpath("//button[contains(@class,'btn nongradient_danger-btn')]")).click();

	     

	     
		 
     }
}
