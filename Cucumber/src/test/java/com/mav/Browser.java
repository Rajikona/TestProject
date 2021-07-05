package com.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class Browser {
	WebDriver driver;
	@BeforeClass
public void open() {
System.setProperty("webdriver.chrome.driver", "chrome path");
 driver = new ChromeDriver();

}
	
	@Test
	public void url() {
driver.get("your url");
	}
}