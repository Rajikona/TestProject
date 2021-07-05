package mav.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FirstProgram {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajyalakshmik\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/register.php ");
        WebElement fName = driver.findElement(By.name("firstName"));
        fName.sendKeys("Rajii");
        String strFname = fName.getAttribute("value");
        System.out.println(strFname);
        WebElement lName = driver.findElement(By.name("lastName"));
        lName.sendKeys("Naidu");
        String strLname = lName.getAttribute("value");
        System.out.println(strLname);
        WebElement Phn = driver.findElement(By.name("phone"));
        Phn.sendKeys("9121944756");
        String phn1 = Phn.getAttribute("value");
        System.out.println(phn1);

 

        WebElement Add = driver.findElement(By.name("address1"));
        Add.sendKeys("Tamilnadu");
        String Add1 = Add.getAttribute("value");
        System.out.println(Add1);

 

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Chennai");
        String Cit = city.getAttribute("value");
        System.out.println(Cit);

 


        WebElement country = driver.findElement(By.name("country"));
        Select S = new Select(country);
        S.selectByVisibleText("ALBANIA");

 


        WebElement uName = driver.findElement(By.xpath("//input[@name='email']"));
        uName.sendKeys("aaaa@gmail.com");
        String uName1 = uName.getAttribute("value");
        System.out.println(uName1);

 


        WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
        pwd.sendKeys("Chicken");
        String pwd1 = pwd.getAttribute("value");
        System.out.println(pwd1);

 

        WebElement cPwd = driver.findElement(By.name("confirmPassword"));
        cPwd.sendKeys("Chicken");
        String cPwd1 = cPwd.getAttribute("value");
        System.out.println(cPwd1);

 


        driver.findElement(By.name("submit")).click();
}
}