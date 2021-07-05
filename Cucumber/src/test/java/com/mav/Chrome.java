package com.mav; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.Test; 
import cucumber.api.java.After; 
public class Chrome { 
@Test 

public void openbrowser() 
{ 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajyalakshmik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver(); 
driver.navigate().to("https://www.flipkart.com/"); 
driver.manage().window().maximize(); 
//driver.addArguments("--disable-notifications"); 
System.out.println("open browser "); 
} 
 @Test 
 public void loginTest() 
 { 
 WebDriver driver=null; 
 @SuppressWarnings("null")
WebElement signin=driver.findElement(By.xpath("//input[@type='text']")); 
signin.click(); 
 System.out.println("user navigates to Login Page"); 
 } 
@Test 
public void messageTest() 
{ 
 System.out.println("success message is displayed"); 
} 
 @Test 
 public void searchTest() 
 { 
 WebDriver driver=null;  
@SuppressWarnings("null")
WebElement search=driver.findElement(By.xpath("//input[@type='password']")); 
search.click();  
} 
public void showTest() { 
System.out.println("we able to sign in");  
} 
@After 
public void close() 
{ 
System.out.println("close browser"); 
} 
} 