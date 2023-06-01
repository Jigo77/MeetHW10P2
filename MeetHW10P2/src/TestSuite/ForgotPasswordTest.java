package TestSuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() throws InterruptedException {

        WebElement forgotlink = driver.findElement(By.xpath("//div/p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgotlink.click();

    }

    @After
    public void tearDown() {

        //closeBrowser();
    }
}
