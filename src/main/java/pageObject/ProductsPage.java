package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends PageObject {
    private final By shoppingCartButton = By.xpath("//a[@class = 'shopping_cart_link']");
    private final By checkOutButton = By.xpath("//button[@class = 'btn btn_action btn_medium checkout_button']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void clickShoppingCartButton() {
        driver.findElement(shoppingCartButton).click();
    }

    public void clickCheckOutButton(){
        driver.findElement(checkOutButton).click();
    }

    public void product() {
        clickShoppingCartButton();
        clickCheckOutButton();
    }
}
