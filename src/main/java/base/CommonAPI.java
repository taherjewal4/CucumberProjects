package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class CommonAPI {

    public WebDriver driver;

    public CommonAPI(WebDriver driver1){
        PageFactory.initElements(driver1,this);
    }

    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/jewal/IntelliJ/CucumberWithSelenium/Common/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void cleanUp() {
        driver.quit();
    }


    public class UntitledTestCase {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @BeforeClass(alwaysRun = true)
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "https://www.katalon.com/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void testUntitledTestCase() throws Exception {
            driver.get("https://www.facebook.com/");
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("taherjuwel3262@gmail.com");
            driver.findElement(By.id("pass")).click();
            driver.findElement(By.id("pass")).clear();
            driver.findElement(By.id("pass")).sendKeys("juhhsdfhhhsdf");
            driver.findElement(By.id("u_0_3")).click();
        }

        @AfterClass(alwaysRun = true)
        public void tearDown() throws Exception {
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        private boolean isAlertPresent() {
            try {
                driver.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }

        private String closeAlertAndGetItsText() {
            try {
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                if (acceptNextAlert) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                return alertText;
            } finally {
                acceptNextAlert = true;
            }
        }
    }
}
