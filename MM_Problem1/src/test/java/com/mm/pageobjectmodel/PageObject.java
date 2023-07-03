package com.mm.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mm.baseclass.BaseClass;

public class PageObject extends BaseClass {

	@FindBy(xpath = "//label[@text()='Value 1']")
	public WebElement value1;
	@FindBy(xpath = "//label[@text()='Value 2']")
	public WebElement value2;
	@FindBy(xpath = "//label[@text()='Value 3']")
	public WebElement value3;
	@FindBy(xpath = "//label[@text()='Value 4']")
	public WebElement value4;
	@FindBy(xpath = "//label[@text()='Value 5']")
	public WebElement value5;

	@FindBy(xpath = "//label[@text()='Total Balance']")
	WebElement totalBalance;

	public String value_1() {
		return value1.getText();
	}

	public String value_2() {
		return value2.getText();
	}

	public String value_3() {
		return value3.getText();
	}

	public String value_4() {
		return value4.getText();
	}

	public String value_5() {
		return value5.getText();
	}

	public String totalBalance() {
		return totalBalance.getText();
	}

	public PageObject() {
		PageFactory.initElements(driver, this);
	}
}
