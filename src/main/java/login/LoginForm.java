package login;

import abstractComponents.AbstractComponent;
import login.locators.LoginFormLocators;
import org.openqa.selenium.WebDriver;

public class LoginForm extends AbstractComponent {
    public LoginForm(WebDriver driver) {
        super(driver);
        //isDisplayed();
    }

    public void login(String username, String password) {
        driver.findElement(LoginFormLocators.USERNAME_INPUT).sendKeys(username);
        driver.findElement(LoginFormLocators.PASSWORD_INPUT).sendKeys(password);
    }

    @Override
    public boolean isDisplayed() {
        commonMethods.waitForElementToBeVisible(LoginFormLocators.PASSWORD_INPUT,
                LoginFormLocators.USERNAME_INPUT);

        return commonMethods.isElementDisplayed(driver.findElement(LoginFormLocators.PASSWORD_INPUT),
                driver.findElement(LoginFormLocators.PASSWORD_INPUT));
    }
}
