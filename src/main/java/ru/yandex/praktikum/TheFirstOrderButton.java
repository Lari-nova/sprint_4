package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TheFirstOrderButton extends BaseClass {
    private By orderButton = By.className("Button_Button__ra12g");
    private By cookieButton = By.className("App_CookieButton__3cvqF");

    public TheFirstOrderButton(WebDriver driver) {
        super(driver);
    }

    public void clickOnCookieButton() {
        driver.findElement(cookieButton).click();
    }

    public void clickOnOrderButton() {
        driver.findElement(orderButton).click();
    }

}
