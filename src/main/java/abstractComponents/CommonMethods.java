package abstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonMethods {
    private WebDriver driver;
    private WebDriverWait wait;

    public CommonMethods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitForElementToBeVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForElementToBeVisible(WebElement element) {
        wait.until((driver) -> element.isDisplayed());
    }
}
