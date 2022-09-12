package ru.yandex.praktikum.firefox.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public abstract class BaseUITestFirefox {
    protected WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\larin\\IdeaProjects\\sprint_4\\src\\main\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
