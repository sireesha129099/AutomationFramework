package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.SearchPage;

public class Signup {
	WebDriver driver;
  @Test
  public void googleSignUp() {
	  SearchPage searchpage = new SearchPage(driver);
	  searchpage.clickSignIn();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractise\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      String url="https://www.Google.com";
      driver.get(url);
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Suite");
  }
}
