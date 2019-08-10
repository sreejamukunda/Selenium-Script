package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.Login;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001 extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData()
	{
		excelFileName="TC001";

			}
	
	@Test(dataProvider="fetchData")
	public void runLogin(String username, String password) {
		new Login()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin();
		//to run either select the needed TC and run in TestNg or just run in TestNG
		
	}


}
