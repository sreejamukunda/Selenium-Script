package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods{
	
	public Login enterUsername(String data) {
		WebElement ele1 = locateElement("id", "UserName");
		//WebElement element = driver.findElementById("UserName");
		clearAndType(ele1, data);
		return this;

	}

	public Login enterPassword(String data) {
		WebElement ele = locateElement("id", "Password");
		//WebElement element = driver.findElementById("UserName");
		clearAndType(ele, data);
		return this;

	}
	
	public Homepage clickLogin() {
		WebElement ele = locateElement("className", "value");
		//WebElement element = driver.findElementById("UserName");
		click(ele);
		return new Homepage();

	}


}
