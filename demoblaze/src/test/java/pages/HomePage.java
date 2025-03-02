package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	private By productLink = By.xpath("//a[normalize-space()='Samsung galaxy s6']");
	public void openProductPage() {
		driver.findElement(productLink).click();
	}
}
