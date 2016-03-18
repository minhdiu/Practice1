package com.vsii.tsc.guru.testdata;

import org.testng.annotations.DataProvider;
import com.vsii.tsc.utility.ExcelHandle;;

public class TestData {
	@DataProvider(name="login")
	public static Object[][] getLoginValid() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Login", "TC02");
		return data;
	}
	
//	@DataProvider(name = "dpLogin")
//	public static Object[][] getLoginData() {
//		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Login", "LO02");
//		return data;
//	}
//
//	@DataProvider(name = "dpValidateCustomer")
//	public static Object[][] getValidateCustomerData() {
//		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateNewCustomer", "CN02");
//		return data;
//	}
//	
//	@DataProvider(name="dpNewCustomer")
//	public static Object[][]  getCustomerData() {
//		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateNewCustomer", "CN03");
//		return data;
//	}

//	@DataProvider(name = "dpEditCustomer")
//	public static Object[][] editCustomerData() {
//		Object[][] data = Utility.getTable("./data/TestData.xlsx", "EditCustomer", "ED03");
//		return data;
//	}
	
	
}
