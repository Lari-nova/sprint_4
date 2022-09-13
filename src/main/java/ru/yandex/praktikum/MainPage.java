package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseClass {

    private By cookieButton = By.className("App_CookieButton__3cvqF");
    private By dropdown = By.className("Home_FourPart__1uthg");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCookieButton() {
        driver.findElement(cookieButton).click();
    }

    public void scroll() {
        WebElement dropAndDown = driver.findElement(dropdown);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", dropAndDown);
    }

    public void clickAndScroll() {
        clickOnCookieButton();
        scroll();
    }
}
