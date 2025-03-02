package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locator
    @FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
    public WebElement addToCartButton;

    // Method
    public void clickAddToCart() {
        addToCartButton.click();
    }
}
