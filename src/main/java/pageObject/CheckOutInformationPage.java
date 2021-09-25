package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutInformationPage extends PageObject{
    private final By firstNameTextBox = By.id("first-name");
    private final By lastNameTextBox =By.id("last-name");
    private final By postalCodeTextBox = By.id("postal-code");
    private final By continueButton = By.xpath("//input[@class = 'submit-button btn btn_primary cart_button btn_action']");
    private final By finishButton = By.xpath("//button[@class='btn btn_action btn_medium cart_button']");

    public CheckOutInformationPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstNameTextBox(String firstname) {
        driver.findElement(firstNameTextBox).sendKeys(firstname);
    }

    public void setLastNameTextBox(String lastname) {
        driver.findElement(lastNameTextBox).sendKeys(lastname);
    }

    public void setPostalCodeTextBox(Integer postalcode) {
        driver.findElement(postalCodeTextBox).sendKeys("10");
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public void clickFinishButton(){
        driver.findElement(finishButton).click();
    }



}
