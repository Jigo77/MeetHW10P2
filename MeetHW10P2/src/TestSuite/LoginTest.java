package TestSuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() throws InterruptedException {


        WebElement emailfeild = driver.findElement(By.name("username"));
        emailfeild.sendKeys("Admin");

        WebElement passwordfeild = driver.findElement(By.name("password"));
        passwordfeild.sendKeys("admin123");

        WebElement loginbutton = driver.findElement(By.xpath("//div/button"));
        loginbutton.click();

    }

    @After
    public void tearDown() {

        closeBrowser();
    }
}
