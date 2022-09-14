package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TheSecondOrderButton extends BaseClass {
    private By button = By.xpath("//div[@class='Home_FinishButton__1_cWm']/button");
    private By cookieButton = By.className("App_CookieButton__3cvqF");

    public TheSecondOrderButton(WebDriver driver) {
        super(driver);
    }

    public void clickOnCookieButton() {
        driver.findElement(cookieButton).click();
    }

    public void findAndClickOnOrderButton() {
        WebElement orderButton = driver.findElement(button);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", orderButton);
        orderButton.click();
    }

    public void clickOnButtons() {
        clickOnCookieButton();
        findAndClickOnOrderButton();
    }
}
