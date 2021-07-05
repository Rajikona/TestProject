package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

 

@SuppressWarnings("unused")
public class Git {
 
@Test
public void openbrowser()
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajyalakshmik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://in.bookmyshow.com/explore/home/chennai");
driver.manage().window().maximize();
//driver.addArguments("--disable-notifications");
System.out.println("open browser ");
}
 @Test
 public void loginTest()
 {
     WebDriver driver=null;
     @SuppressWarnings("null")
	WebElement signin=driver.findElement(By.xpath("//*[@class=\"sc-clNaTc kLXZGE\"]"));
        signin.click();
         System.out.println("user navigates to Login Page");
 }
 
 @Test
 public void mobileTest()
 {
     WebDriver driver=null;

 

        @SuppressWarnings("null")
		WebElement mobilenumber=driver.findElement(By.xpath("//*[@id=\"mobileNo\"]"));
        mobilenumber.sendKeys("1234567892");
        System.out.println("user enters mobilenumber");
 }
 
@Test
public void continueTest()
{
    WebDriver driver=null;
    WebElement Continue=driver.findElement(By.xpath("//*[@class=\"sc-cJSrbW czBflG\"]"));
    Continue.click();     
    System.out.println("Continue");
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
WebElement search=driver.findElement(By.xpath("//*[@class=\"sc-kZmsYB jJgfRB\"]"));
search.click(); 
}

 

@Test
public void moviesTest() {
     WebDriver driver=null; 
WebElement movies=driver.findElement(By.xpath("//*[@class=\"sc-bqjOQT bEsook\"]"));
movies.click(); 
}

 


public void showTest() {
System.out.println("it shows all the movies available"); 
}

 

@After
public void close()
{
System.out.println("close browser");
}

 

}










