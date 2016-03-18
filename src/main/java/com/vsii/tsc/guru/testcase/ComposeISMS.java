package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.method.ISMSMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.utility.TestBase;

public class ComposeISMS extends TestBase
{
    LoginPageMethod objLogin; 
    ISMSMethod objISMS;
    @BeforeClass
    public void setupClass() throws NumberFormatException, IOException {
        objLogin = new LoginPageMethod(TestBase.driver);
        objISMS = new ISMSMethod(TestBase.driver);
    }

    @Test(priority = 0, description = "Verify that the form Compose ISMS Request is opened correctly")
    public void TC04() throws IOException {     
        TestBase.methodName = "TC04";
        objLogin.login("diuttm","ddduong123*"); 
        objISMS.GotoISMSPage();
        objISMS.ClickComposeISMSRequest();
        objISMS.VerifyComposeISMSReuestPopUp();
    }
}
