import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 
public class Facebook { 
   WebDriver driver = null; 
	
   @Given("user navigates to facebook") 
   public void goToFacebook() { 
	   WebDriver driver = new ChromeDriver();
      driver.navigate().to("https://www.facebook.com/"); 
   } 
	
   @When("^I enter Username as \"Rajii\" and Password as \"test\"$") 
   public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
      driver.findElement(By.id("email")).sendKeys(arg1);
      driver.findElement(By.id("pass")).sendKeys(arg2);
      driver.findElement(By.id("u_0_v")).click(); 
   } 
	
   @Then("^login should be unsuccessful$") 
   public void validateRelogin() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
      "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
         System.out.println("Test Pass"); 
      } else { 
         System.out.println("Test Failed"); 
      } 
      driver.close(); 
   }    
}