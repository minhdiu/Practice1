package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.vsii.tsc.guru.pages.LoginPage;

public class LoginPageMethod {	
	ExtentReports extent;
	
	//Logger log = Logger.getLogger("minhdiu");
	
	WebDriver driver;

	public LoginPage objLoginPage = new LoginPage();

	public LoginPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objLoginPage);
		//log.debug("Initiate web driver");
	}

	// Enter user name in UserID text box
	public void setUsername(String txtUsername) {		
		objLoginPage.Username_txb.sendKeys(txtUsername);
		//log.debug("Set username");
	}

	// Enter password in password text box
	public void setPassword(String txtPassword) {		
		objLoginPage.Password_txb.sendKeys(txtPassword);
		//log.debug("Set password");
	}

	// Click Login button
	public void clickLogin() {
		objLoginPage.Login_btn.click();
		//log.debug("Click Login button");
	}

	public void verifyLoginPage() {
	    String loginPageTitle = driver.getTitle();
        Assert.assertTrue(loginPageTitle.contains("OpenERP"));
        Assert.assertTrue(objLoginPage.Username_txb.getSize()!=null );
        Assert.assertTrue(objLoginPage.Password_txb.getSize()!=null );
    }
	
	public void login(String username, String password) {
	
		this.setUsername(username);
	//	ExtentReporterNG.test.log(LogStatus.INFO, "Input user name");
		
		this.setPassword(password);
	//	ExtentReporterNG.test.log(LogStatus.INFO, "Input password");
		
		this.clickLogin();
	//	ExtentReporterNG.test.log(LogStatus.INFO, "Click Login");
		//log.debug("Login to Home page");
	}

//	public void logout() {
//		objLoginPage.getWebLogOut().click();
//		log.debug("Click log out button");
//	}
}
