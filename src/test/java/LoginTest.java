import abstractComponents.BaseTest;
import com.google.common.util.concurrent.Uninterruptibles;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentials() {
        String username = "standard_user";
        String password = "secret_sauce";
        loginPage.getLoginForm().login(username, password);
        Uninterruptibles.sleepUninterruptibly(4, TimeUnit.SECONDS);
    }

}
