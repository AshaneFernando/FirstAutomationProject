package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageObject {
    private final By userNameTextBox = By.id("user-name");
    private final By userPasswordTextBox = By.id("password");
    private final By loginButton = By.xpath("//input[@class='submit-button btn_action']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void setUserNameTextBox(String username) {
        driver.findElement(userNameTextBox).sendKeys(username);
    }
    public void setUserPasswordTextBox(String password) {
        driver.findElement(userPasswordTextBox).sendKeys(password);
    }
    public void clickloginButton() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        setUserNameTextBox(username);
        setUserPasswordTextBox(password);
        clickloginButton();
    }
}
