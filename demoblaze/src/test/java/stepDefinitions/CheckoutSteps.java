package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.CheckoutPage;

public class CheckoutSteps {
    WebDriver driver;
    CheckoutPage checkoutPage;

    @Given("I am on the checkout page")
    public void i_am_on_the_checkout_page() {
//        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/cart.html"); // Checkout page URL
        checkoutPage = new CheckoutPage(driver);
    }

    @When("I enter name {string}")
    public void i_enter_name(String name) {
        checkoutPage.nameField.sendKeys(name);
    }

    @When("I enter country {string}")
    public void i_enter_country(String country) {
        checkoutPage.countryField.sendKeys(country);
    }

    @When("I enter city {string}")
    public void i_enter_city(String city) {
        checkoutPage.cityField.sendKeys(city);
    }

    @When("I enter credit card {string}")
    public void i_enter_credit_card(String cardNumber) {
        checkoutPage.creditCardField.sendKeys(cardNumber);
    }

    @When("I enter month {string}")
    public void i_enter_month(String month) {
        checkoutPage.monthField.sendKeys(month);
    }

    @When("I enter year {string}")
    public void i_enter_year(String year) {
        checkoutPage.yearField.sendKeys(year);
    }

    @When("I click the {string} button")
    public void i_click_the_button(String buttonName) {
        if (buttonName.equalsIgnoreCase("Purchase")) {
            checkoutPage.clickPurchase();
        }
    }

    @Then("The order should be placed successfully")
    public void the_order_should_be_placed_successfully() {
        System.out.println("Order placed successfully!");
        driver.quit();
    }
}
