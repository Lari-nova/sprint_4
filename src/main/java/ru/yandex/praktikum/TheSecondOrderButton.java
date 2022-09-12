package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TheSecondOrderButton extends BaseClass {
    private By orderButton = By.xpath("//div[@class='Home_FinishButton__1_cWm']/button");
    private By cookieButton = By.className("App_CookieButton__3cvqF");

    public TheSecondOrderButton(WebDriver driver) {
        super(driver);
    }

    public void clickOnCookieButton() {
        driver.manage().deleteAllCookies();
        driver.findElement(cookieButton).click();
    }

    public WebElement findOnOrderButton() {
        return driver.findElement(orderButton);
    }


}
