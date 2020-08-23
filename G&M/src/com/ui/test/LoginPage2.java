package com.ui.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
@Test
public class LoginPage2 {
    public String baseUrl = "http://13.68.177.67/#/login";
    String driverPath = "C:/Aavinash Testing/Automation1/chromedriver.exe";
    public WebDriver driver; 
    //public String expected = null;
    //public String actual = null;
        @BeforeTest
      public void launchBrowser() {
          System.out.println("CromeBrowser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver= new ChromeDriver();
  		  driver.manage().window().maximize();
  		  driver.manage().deleteAllCookies();
          driver.get(baseUrl);
 		  //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

      }
      
        @Test(priority = 0)
      public void verifyLoginpageUrl() throws InterruptedException {
 		  //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
          String actualurl = "http://13.68.177.67/#/login";
          System.out.println("Actual LogIn URL is :" +actualurl);
          Thread.sleep(10000);
          String expectedURL = driver.getCurrentUrl();
          System.out.println("Expected LogIn URL is :" +expectedURL);
          System.out.println(actualurl.equals(expectedURL));
          /*if (actualurl==expectedURL)
          {
        	  System.out.println("LogIn URL is correct");
          }
          else
          {
        	  System.out.println("LogIn URL is wrong");
          }
          //Assert.assertEquals(actualurl, expectedURL);*/
      }
          @Test(priority = 1)
      public void LogIn() throws InterruptedException{
     		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
      		//Enter Email
      		driver.findElement(By.id("email")).sendKeys("avinash@petras.in");
      		//Enter Password
      		driver.findElement(By.id("password")).sendKeys("Avinash@1234");
    		WebElement LogIn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
    		LogIn.click();
      	  Thread.sleep(10000);

      }
          /*@Test(priority = 1)
          public void verifyHomepageUrl() throws InterruptedException {
              String expectedHomeUrl = "http://13.68.177.67/#/Home";
      		  Thread.sleep(1000);
              String actualHomeUrl = driver.getCurrentUrl();
             // Assert.assertEquals(actualHomeUrl, expectedHomeUrl);
      		System.out.println(actualHomeUrl);
    		if (actualHomeUrl ==  expectedHomeUrl) {
    			System.out.println("Login successful");
    		} else {
    			System.out.println("Login Failed");

    		}
    		/*boolean login = false;
    		if (actualHomeUrl.trim().equalsIgnoreCase(expectedHomeUrl))
    			login = true;
    		else
    			login = false;

    		if (!login) {
    			System.out.println("Login Failed");
    		} else {
    			System.out.println("Login successful");

    		}
    		**/
    	
          @Test(priority = 2)
        	  public void verifyLogin() throws InterruptedException
        	  {
        	  
        	  String RealUser = "avinash@petras.in";
        	  System.out.println("Real User: "+RealUser);
        	
        	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        	  driver.findElement(By.xpath("//a[contains(text(),'Welcome Avinash !')]")).click();
        	  //driver.findElement(By.xpath("//a[contains(text(),'My Profile')])")).click();
        	  driver.findElement(By.partialLinkText("My Profi")).click();
        	  //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        	  Thread.sleep(2000);
        	  String ExpectedUser = driver.findElement(By.id("Email")).getAttribute("ng-reflect-model");
        	  //String ExpectedUser = driver.findElement(By.id("Email")).getText();
        	  System.out.println("Expected User: "+ExpectedUser); 
        	  System.out.println(RealUser.equalsIgnoreCase(ExpectedUser));
        	  
        	  }

 
      }
      
