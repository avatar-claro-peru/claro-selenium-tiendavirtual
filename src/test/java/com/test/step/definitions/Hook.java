package com.test.step.definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Hook {

	public static WebDriver driver;

	@Before("@web")
	public void inicioWeb() {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				path + "\\src\\test\\resources\\files\\software\\windows\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static WebDriver getDriver() {
		return driver;
	}

}