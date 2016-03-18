package com.vsii.tsc.guru.pages.method;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public void ClickComposeISMSRequest(){
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    objISMSPage.ComposeISMSRequest.click();
}
public void ClickISMSissue(){
    objISMSPage.ISMSIssue.click();
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
    List<WebElement> el = driver.findElements(By.xpath("//*"));

    for ( WebElement e : el ) {
      System.out.println(e.getTagName()+ ":"+ e.getText());
    }
  //  Assert.assertTrue(objISMSPage.AssetCategories.getSize()==null);
  //  Assert.assertTrue(objISMSPage.Assets.getSize()==null);
//    Assert.assertTrue(objISMSPage.ComposeISMSRequest.getSize()!=null);
//    Assert.assertTrue(objISMSPage.ISMSIssue.getSize()!=null);
//    Assert.assertTrue(objISMSPage.ISMSRequest.getSize()!=null);
// 
    //Assert.assertEquals(0,objISMSPage.AssetCategories).Size());
//    Assert.assertTrue(!isElementPresent(By.linkText("Empresas en Misión")));
 }
public void getTitlePopup(){
    String title = objISMSPage.composeTitle.getText();
    Assert.assertEquals(title, "Compose ISMS Request");    
}
public void getComposeIssueLable(){
    String title = objISMSPage.composeIssue_label.getText();
    Assert.assertEquals(title, "What is the issue?");    
}
public void getComposeCategoryLable(){
    String title = objISMSPage.composeCategory_lable.getText();
    Assert.assertEquals(title, "Please choose a category");    
}
public void getComposeProblemLable(){
    String title = objISMSPage.composeProblem_lable.getText();
    Assert.assertEquals(title, "What problem is your issue relating to? ");    
}
public void getSimilarIssueLable(){
    String title = objISMSPage.similarIssue_lable.getText();
    Assert.assertEquals(title, "Anything is similar with your issue?");    
}
public void VerifyComposeISMSReuestPopUp(){

    getTitlePopup();
    getComposeIssueLable();
    getComposeCategoryLable();
    getComposeProblemLable();
    getSimilarIssueLable();
   
}

}
