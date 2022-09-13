package ru.yandex.praktikum;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.WebStorage;

import java.time.Duration;

public abstract class BaseUITest {

    public static WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\larin\\IdeaProjects\\sprint_4\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

        // System.setProperty("webdriver.gecko.driver","C:\\Users\\larin\\IdeaProjects\\sprint_4\\src\\main\\resources\\geckodriver.exe");
       // driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void clearSiteData() {
        driver.manage().deleteAllCookies();
        ((WebStorage)driver).getSessionStorage().clear();
        ((WebStorage)driver).getLocalStorage().clear();
    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }
}
