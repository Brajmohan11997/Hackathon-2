package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.CartPage;

public class CartSteps {
    WebDriver driver;
    CartPage cartPage;

    @Given("I am on the cart page")
    public void i_am_on_the_cart_page() {
//        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/cart.html"); // Cart page URL
        cartPage = new CartPage(driver);
    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String buttonName) {
        if (buttonName.equalsIgnoreCase("Cart")) {
            cartPage.openCart();
        } else if (buttonName.equalsIgnoreCase("Place Order")) {
            cartPage.proceedToCheckout();
        }
    }

    @Then("The checkout process should start")
    public void the_checkout_process_should_start() {
        System.out.println("Proceeding to checkout...");
        driver.quit();
    }
}
