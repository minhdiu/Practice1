package com.vsii.tsc.guru.pages.method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.apache.log4j.Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.vsii.tsc.guru.pages.LoginPage;

public class LoginPageMethod {	
	ExtentReports extent;
	
	Logger log = Logger.getLogger("trunghung");
	
	WebDriver driver;

	public LoginPage objLoginPage = new LoginPage();

	public LoginPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objLoginPage);
		log.debug("Initiate web driver");
	}

	
	public void setUsername(String txtUsername) {		
		objLoginPage.Username_txb.sendKeys(txtUsername);
		log.debug("Set username");
	}

	public void setPassword(String txtPassword) {		
		objLoginPage.Password_txb.sendKeys(txtPassword);
		log.debug("Set password");
	}


	public void clickLogin() {
		objLoginPage.Login_btn.click();
		log.debug("Click Login button");
	}

	public void verifyLoginPage() {
	    String loginPageTitle = driver.getTitle();
        Assert.assertTrue(loginPageTitle.contains("OpenERP"));
        Assert.assertTrue(objLoginPage.Username_txb.getSize()!=null );
        Assert.assertTrue(objLoginPage.Password_txb.getSize()!=null );
    }
	
	public void login(String username, String password) {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
