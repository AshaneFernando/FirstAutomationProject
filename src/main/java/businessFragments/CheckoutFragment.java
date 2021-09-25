package businessFragments;

import org.openqa.selenium.WebDriver;
import pageObject.CheckOutInformationPage;

public class CheckoutFragment extends CheckOutInformationPage {
    public CheckoutFragment(WebDriver driver) {
        super(driver);
    }

    public void checkoutDetails(String firstname, String lastname, Integer postalcode) {
        setFirstNameTextBox(firstname);
        setLastNameTextBox(lastname);
        setPostalCodeTextBox(postalcode);
        clickContinueButton();
        clickFinishButton();
    }
}
