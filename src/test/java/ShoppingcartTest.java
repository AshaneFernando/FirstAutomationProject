import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.ProductsPage;

public class ShoppingcartTest extends BaseTest {

    @BeforeMethod
    public void testUserCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }
    @Test
    public void cart() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.product();
    }

}
