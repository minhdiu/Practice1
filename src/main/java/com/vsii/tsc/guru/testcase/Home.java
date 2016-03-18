package com.vsii.tsc.guru.testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.LoginPage;
import com.vsii.tsc.guru.pages.method.ISMSMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class Home extends TestBase
{
    LoginPageMethod objLogin; 
    ISMSMethod objISMS;
    @BeforeClass
    public void setupClass() throws NumberFormatException, IOException {
        objLogin = new LoginPageMethod(TestBase.driver);
        objISMS = new ISMSMethod(TestBase.driver);
    }

    //@Test(priority = 0, description = "Verify OpenERP can open correctly")
    public void TC01() throws IOException {     
        TestBase.methodName = "TC01";
        objLogin.verifyLoginPage();          
    }
   @Test(priority = 1, description = "Admin_Verify that ISMS Helpdesk is displayed correctly_User is admin or ISMS Managers"
       ,dataProvider = "login", dataProviderClass = TestData.class)
    public void TC02(String username, String password) throws IOException {     
        TestBase.methodName = "TC02";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        objLogin.login(username,password); 
        objISMS.GotoISMSPage();
        objISMS.VerifyISMSAdmin();
    }
 @Test(priority = 2, description = "Verify that ISMS Helpdesk is displayed correctly_User is not admin or ISMS Managerss",dataProvider = "login", dataProviderClass = TestData.class)
    public void TC03(String username, String password) throws IOException {     
        TestBase.methodName = "TC03";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        objLogin.login(username,password);
        objISMS.GotoISMSPage();
        objISMS.VerifyISMSnotAdmin();
    }
//    @Test(priority = 2, description = "verify Login", dataProvider = "dpLogin", dataProviderClass = TestData.class)
//    public void LO02(String username, String password, String message) throws Exception {
//
//        //get method's name
//        TestBase.methodName = "LO02";
//        // perform login
//        objLogin.loginToManagerPage(username, password);
//
//        // input invalid account, having popup. If not, login successfully
//        if (CommonOperations.isAlertPresent(TestBase.driver)) {
//            // Get popup's text
//            String txtPopup = objLogin.getPopupText();
//            Assert.assertTrue(txtPopup.contains(message));
//        } else {
//            String managerID;
//            managerID = objLogin.getManagerIDInManagerPage();
//            Assert.assertTrue(managerID.contains(message));
//        }
//    }
//    
//     @Test(priority = 1, description = "verify_Reset_Button", dataProvider = "dpReset", dataProviderClass = TestData.class)
//     public void LO03(String username, String password) throws Exception {
//        //get method's name
//        TestBase.methodName = "LO03";
//        objLogin.setUserID(username);
//        objLogin.setPassword(password);
//        objLogin.clickReset();
//        Assert.assertEquals(objLogin.getUserID(), "");
//        Assert.assertEquals(objLogin.getPassword(), "");
//     }
//
//    @AfterMethod
//    public void afterMethod() throws Exception {
//        CommonOperations.takePicture();
//   }
//
//   @AfterClass
//    public void teardownClass() {
//       objLogin = null;    
//    }

//}


}
