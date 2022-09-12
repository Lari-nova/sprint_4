package ru.yandex.praktikum.chrome.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class BaseUITestChrome {
    protected WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\larin\\IdeaProjects\\sprint_4\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
