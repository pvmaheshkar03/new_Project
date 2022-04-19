package com.projectbanking.testclass;

import org.testng.annotations.Test;
import com.projectbanking.pageobjectclass.BaseClass;
import com.projectbanking.pageobjectclass.LogIn_page;

public class LoginTest_001 extends BaseClass{
	@Test
public void loginTest() {
	driver.get(baseURL);
	
	LogIn_page login= new LogIn_page(driver);
	login.setUser(username);              //pre-defined setUser
	login.setPaswd(password);            //pre-defined setPaswd
	login.LogButn();                    //predefined LogButn  created by user
	
	if(driver.getTitle().equals("Bank Manager Home Page"))
	{
		System.out.println("correct title");
	}
	else {
		System.out.println("incorrect title");
	}
}
}
