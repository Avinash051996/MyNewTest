package com.ui.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
@Test
public class LoginPage3 {
    public String baseUrl = "http://13.68.177.67/#/login";
    String driverPath = "C:/Aavinash Testing/Automation1/chromedriver.exe";
    public WebDriver driver; 
    public String expected = null;
    public String actual = null;
        @BeforeTest
      public void launchBrowser() {
          System.out.println("CromeBrowser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver= new ChromeDriver();
  		  driver.manage().window().maximize();
  		  driver.manage().deleteAllCookies();
          driver.get(baseUrl);
      }
      
      @BeforeMethod
      public void verifyLoginpageUrl() {
          String expectedURL = "http://13.68.177.67/#/login";
          String actualurl = driver.getCurrentUrl();
          Assert.assertEquals(actualurl, expectedURL);
      }
          @Test(priority = 0)
      public void LogIn() throws InterruptedException, FileNotFoundException{
        	 FileInputStream fi = new FileInputStream("C:\\Aavinash Testing\\LoginInputData.xlsx");
      		//Enter Email
      		driver.findElement(By.id("email")).sendKeys("avinash@petras.in");
      		//Enter Password
      		driver.findElement(By.id("password")).sendKeys("Avinash@123");
    		WebElement LogIn = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block loginbtn']"));
    		LogIn.click();
      }
          @Test(priority = 1)
          public void verifyHomepageUrl() throws InterruptedException {
              String expectedUrl = "http://13.68.177.67/#/Home";
      		  Thread.sleep(10000);
              String actualUrl = driver.getCurrentUrl();
              Assert.assertEquals(actualUrl, expectedUrl);
      		System.out.println(actualUrl);
    		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    		boolean login = false;
    		if (actualUrl.trim().equalsIgnoreCase(expectedUrl))
    			login = true;
    		else
    			login = false;

    		if (!login) {
    			System.out.println("Login Failed");
    		} else {
    			System.out.println("Login successful");

    		}
      
      }
       
      //@AfterTest
      //public void terminateBrowser(){
        //driver.close();
      }
