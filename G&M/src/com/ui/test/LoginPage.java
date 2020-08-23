package com.ui.test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage  {

	public LoginPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	public WebElement EmailField;

	@FindBy(id = "password")
	public WebElement PasswordField;

	@FindBy(className = "btn btn-primary btn-block loginbtn")
	public WebElement Login_button;

	@FindBy(xpath = "//*[@id='navbar']//ul[@id='navigation-top']//a[@class='pl-user-info dropdown-toggle']")
	public List<WebElement> isLogin;

	@FindBy(xpath = "//a[@class='nav-link']")
	public List<WebElement> isLoginLogout;

	public Object doLogin(String username, String password) throws InterruptedException {
		WebDriver driver = null;
		WebDriverWait wt = new WebDriverWait(driver, 200);
		// Entering username
		sendKeys(this.EmailField, "UserName", username);
		// Entering Password
		sendKeys(this.PasswordField, "Password", password);
		// Click on Login button
		click(this.Login_button, "Submit_button");
		
		Thread.sleep(5000);
		// System.out.println(driver.getTitle());
		@SuppressWarnings("null")
		String title = driver.getTitle();
		System.out.println(title);
		boolean login = false;
		if (title.trim().equalsIgnoreCase("G & M"))
			login = true;
		else
			login = false;

		if (!login) {
			System.out.println("Login Failed");
		} else {
			System.out.println("Login successful");

		}
		return login;

	}

	private void click(WebElement login_button2, String string) {
		// TODO Auto-generated method stub
		
	}

	private void sendKeys(WebElement emailField2, String string, String username) {
		// TODO Auto-generated method stub
		
	}
}