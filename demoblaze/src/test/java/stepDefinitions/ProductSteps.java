package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.ProductPage;

public class ProductSteps {
    WebDriver driver;
    ProductPage productPage;

    @Given("I am on the product page")
    public void i_am_on_the_product_page() {
//        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/prod.html?idp_=1"); // Example product page URL
        productPage = new ProductPage(driver);
    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String buttonName) {
        if (buttonName.equalsIgnoreCase("Add to cart")) {
            productPage.clickAddToCart();
        }
    }

    @Then("The product should be added to the cart")
    public void the_product_should_be_added_to_the_cart() {
        System.out.println("Product added to cart successfully!");
        driver.quit();
    }
}
