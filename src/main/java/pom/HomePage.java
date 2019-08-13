package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {

    public static WebDriver driver;
    @FindBy(id = "email")
    WebElement usename;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(id = "loginbutton")
    WebElement loginTab;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public static void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/jewal/IntelliJ/CucumberProjects/src/browser-driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void cleanUp() {
        driver.quit();
    }

    public void setUsename(String keys) {
        usename.sendKeys(keys);
    }

    public void setPassword(String keys) {
        password.sendKeys(keys);
    }

    public void setLoginTab() {
        loginTab.click();
    }

    public String getTitle(){
        return driver.getTitle();
    }


}
