package login;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final LoginForm loginForm;

    public LoginPage(WebDriver driver) {
        loginForm = new LoginForm(driver);
    }

    public LoginForm getLoginForm() {
        return loginForm;
    }
}
