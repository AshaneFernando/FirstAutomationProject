import businessFragments.CheckoutFragment;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.CheckOutInformationPage;
import pageObject.LoginPage;
import pageObject.ProductsPage;

public class CheckOutInformationTest extends BaseTest {
    @BeforeMethod
    public void testUserCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.product();
    }
//
//    @AfterMethod
//    public void cart() {
//        pageObject.ProductsPage productsPage = new pageObject.ProductsPage(driver);
//        productsPage.product();
//    }

    @Test
    public void testCheckOutInformation() {
        CheckoutFragment checkOutInformationPage = new CheckoutFragment(driver);
        checkOutInformationPage.checkoutDetails("John","Fernando",11500);
    }
}