import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testUserCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

}
