package com.mm.baseclass;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	@Before
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@After
	public void tear() {
		driver.quit();
	}

}
