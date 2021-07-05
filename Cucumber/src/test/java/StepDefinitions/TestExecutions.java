package StepDefinitions;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestExecutions {
public static WebDriver driver;
@Given("^user is on homepage$")
public void user_is_on_homepage() throws Throwable {
File file = new File("lib/chromedriver.exe");
String filePath = file.getAbsolutePath();
System.out.println(filePath);
System.setProperty("webdriver.chrome.driver", filePath);
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("start-maximized");
driver = new ChromeDriver(chromeOptions);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.facebook.com/");
}

@When("^user navigates to Login Page$")
public void user_navigates_to_Login_Page() throws Throwable {
}

@When("^user click login$")
public void user_click_login() throws Throwable {
WebElement Account=driver.findElement(By.xpath("//*[@class=\"fa fa-user\"]"));
Account.click();

}

@Then("^it will navigates to login page$")
public void it_will_navigates_to_login_page() throws Throwable {
//*[@class="header-bottom-inner"]
WebElement login=driver.findElement(By.xpath("https://www.facebook.com/"));
login.click();
}

@Then("^user enters username and Password$")
public void user_enters_username_and_Password() throws Throwable {
driver.findElement(By.xpath("//input[@id=\"emailphone\"]")).sendKeys("konarajyalakshmi@gmail.com");
driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("rajinaidu");
driver.findElement(By.xpath("//input[@class=\"btn btn-primary pull-left\"]")).click();
}

@When("^user enter username \"([^\"]*)\"$")
public void user_enter_username(String arg1) throws Throwable {
}

@When("^user enter password \"([^\"]*)\"$")
public void user_enter_password(String arg1) throws Throwable {
}

@When("^click on login button$")
public void click_on_login_button() throws Throwable {
}

@Then("^success message is displayed$")
public void success_message_is_displayed() throws Throwable {
}

@Then("^user logged in successfully$")
public void user_logged_in_successfully() throws Throwable {
}
@Given("^user is on loginpage$")
public void user_is_on_loginpage() throws Throwable {

}

@When("^user click track your order$")
public void user_click_track_your_order() throws Throwable {
driver.findElement(By.xpath("https://www.facebook.com/")).click();
}

@Then("^it will navigates to tracking page$")
public void it_will_navigates_to_tracking_page() throws Throwable {
}


@Before
public void openbrowser()
{
System.out.println("Opening browser");
}


@After
public void closebrowser()
{
System.out.println("Close browser");
//driver.quit();
}
}
