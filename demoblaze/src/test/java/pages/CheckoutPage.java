package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id = "name")
    public WebElement nameField;

    @FindBy(id = "country")
    public WebElement countryField;

    @FindBy(id = "city")
    public WebElement cityField;

    @FindBy(id = "card")
    public WebElement creditCardField;

    @FindBy(id = "month")
    public WebElement monthField;

    @FindBy(id = "year")
    public WebElement yearField;

    @FindBy(xpath = "//button[normalize-space()='Purchase']")
    public WebElement purchaseButton;

    // Method to fill checkout details
    public void fillCheckoutDetails(String name, String country, String city, String cardNumber, String month, String year) {
        nameField.sendKeys(name);
        countryField.sendKeys(country);
        cityField.sendKeys(city);
        creditCardField.sendKeys(cardNumber);
        monthField.sendKeys(month);
        yearField.sendKeys(year);
    }

    // Method to click on Purchase button
    public void clickPurchase() {
        purchaseButton.click();
    }
}
