package abstractComponents;

import org.openqa.selenium.WebDriver;

public abstract class AbstractComponent {
    protected WebDriver driver;

    protected CommonMethods commonMethods;

    public AbstractComponent(WebDriver driver) {
        commonMethods = new CommonMethods(driver);
        this.driver = driver;
    }

    public abstract boolean isDisplayed();
}
