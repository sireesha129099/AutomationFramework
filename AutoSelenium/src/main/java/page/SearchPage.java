package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends Page {
	By signButton = By.id("gd_70");
	By searchBox= By.name("q");
	
	public SearchPage(WebDriver driver) {
		super(driver);
	
	}
	public void clickSignIn() {
		
		super.click(signButton);
	}
	public void search(String value) {
		super.enterText(searchBox, value);
		
	}

}
