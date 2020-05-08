package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page implements Ipage {
	
	WebDriver driver;
	
	public Page(WebDriver driver) {
		this.driver=driver;
		
	}

	@Override
	public void click(By b) {
		// TODO Auto-generated method stub
		driver.findElement(b).click();
		
	}

	@Override
	public void enterText(By b, String value) {
		// TODO Auto-generated method stub
		driver.findElement(b).sendKeys(value);
		
	}
	
	

}
