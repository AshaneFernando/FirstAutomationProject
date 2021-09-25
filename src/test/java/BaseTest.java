import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public static final WebDriver driver = new ChromeDriver();

    //@BeforeMethod annotated method will be invoked before the execution of each test method
    @BeforeMethod
    public void setup() {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.get("https://www.saucedemo.com/");

    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }

}
