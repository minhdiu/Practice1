package com.vsii.tsc.guru.commethods;

import org.openqa.selenium.By;

import com.vsii.tsc.guru.pages.method.DiuTTM_LoginPageMethod;
import com.vsii.tsc.utility.TestBase;

public class CommonMethods {
  //Check login or not
	public static void checkLogin(){
		DiuTTM_LoginPageMethod objLogin;
		objLogin = new DiuTTM_LoginPageMethod(TestBase.driver);
		if(TestBase.driver.findElements(By.name("login")).size()!=0){
			objLogin.login("diuttm", "duong123*");
		}
	}
}
