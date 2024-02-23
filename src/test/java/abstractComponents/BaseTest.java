package abstractComponents;

import login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;

    protected LoginPage loginPage;

    @BeforeClass
    public void setupDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openApp() {
        driver.get("https://saucedemo.com");
        loginPage = new LoginPage(driver);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
