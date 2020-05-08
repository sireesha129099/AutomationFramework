package SeleniumTraining.AutoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractise\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String url="https://www.spicejet.com";
        driver.get(url);
        Thread.sleep(1000);
        WebElement passenger = driver.findElement(By.cssSelector("//div[@id='divpaxinfo'text()='1 Adult]"));
        passenger.click();
        String xpath = passenger("Adult");
        Select adult = new Select(driver.findElement(By.xpath(xpath)));
        adult.selectByIndex(5);
        xpath = passenger("Child");
        Select child = new Select(driver.findElement(By.xpath(xpath)));
        adult.selectByIndex(2);
        xpath = passenger("Infant");
        Select infant = new Select(driver.findElement(By.xpath(xpath)));
        adult.selectByIndex(1);
        
        
       
	}

	private static String passenger(String string) {
		String xpath = "//select[contains(@name,'"+string+"')]";
		return xpath;
	}

}
