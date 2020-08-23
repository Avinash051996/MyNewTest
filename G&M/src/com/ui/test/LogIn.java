/**
 * 
 */
package com.ui.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author ebn020
 *
 */
public class LogIn {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:/Aavinash Testing/Automation1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String currentURL = null;
		driver.get("http://13.68.177.67/#/login?returnUrl=%2FHome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Enter Email
		driver.findElement(By.id("email")).sendKeys("avinash@petras.in");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("Avinash@123");
		//Getting all Links on from Current page
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 1; i<=links.size(); i=i+1)
		{
			System.out.println(links.get(i).getText());
		}
		//LONIN button Click
		WebElement LogIn = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block loginbtn']"));
		LogIn.click();
		Thread.sleep(20000);
		//Get Current URL
		currentURL = driver.getTitle();
		System.out.println(currentURL);
		//Verifying Current User Name
		driver.findElement(By.className("nav-link")).getText();
		
	}

}
