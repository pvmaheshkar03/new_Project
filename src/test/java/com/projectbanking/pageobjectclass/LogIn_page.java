package com.projectbanking.pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_page {
	WebDriver driver;
	// finding Elements
	@FindBy(name = "user-name")
	WebElement userId;
	@FindBy(name = "password")
	WebElement Pwd;
	@FindBy(name = "login-button")
	WebElement Login;

	// constructor
	public LogIn_page(WebDriver drv) {
		driver = drv;
		PageFactory.initElements(drv, this);
	}

	public void setUser(String name) {
		userId.sendKeys(name);
	}

	public void setPaswd(String pw) {
		Pwd.sendKeys(pw);
	}

	public void LogButn() {
		Login.click();
	}
}