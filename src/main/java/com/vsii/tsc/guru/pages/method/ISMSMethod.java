package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.vsii.tsc.guru.pages.ISMSPage;

public class ISMSMethod
{
ExtentReports extent;
    
    //Logger log = Logger.getLogger("minhdiu");
    
    WebDriver driver;

    public ISMSPage objISMSPage = new ISMSPage();

    public ISMSMethod(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, objISMSPage);
        //log.debug("Initiate web driver");
    }
public void GotoISMSPage(){
    objISMSPage.ISMSHelpdesk_btn.click();
}

public void VerifyISMSAdmin(){
   Assert.assertTrue(objISMSPage.AssetCategories.getSize()!=null);
   Assert.assertTrue(objISMSPage.Assets.getSize()!=null);
   Assert.assertTrue(objISMSPage.ComposeISMSRequest.getSize()!=null);
   Assert.assertTrue(objISMSPage.ISMSIssue.getSize()!=null);
   Assert.assertTrue(objISMSPage.ISMSRequest.getSize()!=null);
   Assert.assertTrue(objISMSPage.IssueManagement.getSize()!=null);  
}

public void VerifyISMSnotAdmin(){
  //  Assert.assertTrue(objISMSPage.AssetCategories.getSize()==null);
  //  Assert.assertTrue(objISMSPage.Assets.getSize()==null);
    Assert.assertTrue(objISMSPage.ComposeISMSRequest.getSize()!=null);
    Assert.assertTrue(objISMSPage.ISMSIssue.getSize()!=null);
    Assert.assertTrue(objISMSPage.ISMSRequest.getSize()!=null);
 
    //Assert.assertEquals(0,objISMSPage.AssetCategories).Size());
//    Assert.assertTrue(!isElementPresent(By.linkText("Empresas en Misión")));
 }
}
