package test;
import main.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ControllerTest{
    String testString="a";

   @Test
   public void testEquals() {

   System.setProperty("webdriver.chrome.driver","C:\\jenkins\\support\\chromedriver.exe");
	//Set Chrome Headless mode as TRUE
	ChromeOptions options = new ChromeOptions();
	options.setHeadless(true);

	//Instantiate Web Driver
	WebDriver driver = new ChromeDriver(options);
	driver.get("http://localhost:8081/atom");

  	//WebElement searchBox = driver.findElement(By.name("q"));
  	//searchBox.sendKeys("ChromeDriver");
  	//searchBox.submit();
 	assertEquals("Sign in [Jenkins]", driver.getTitle());
 	driver.quit();
   }
}
