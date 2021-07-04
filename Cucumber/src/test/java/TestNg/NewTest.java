package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver d;
  @Test
  public void f() 
  {
	  System.out.println("gogle page ");
  }
  @BeforeTest
  public void beforeTest() 
  { 
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rajyalakshmik\\\\Documents\\\\Chrome\\\\chromedriver.exe");
      d=new ChromeDriver();
      d.get("https://www.google.com/");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("close page");
        d.close();
  }

}
