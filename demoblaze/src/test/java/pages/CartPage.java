package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id = "cartur")
    public WebElement cartButton;

    @FindBy(xpath = "//button[normalize-space()='Place Order']")
    public WebElement checkoutButton;

    // Methods
    public void openCart() {
        cartButton.click();
    }

    public void proceedToCheckout() {
        checkoutButton.click();
    }
}
