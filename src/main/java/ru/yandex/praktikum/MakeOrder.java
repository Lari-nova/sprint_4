package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MakeOrder extends BaseClass {

        private By yesButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");
        private By modalOfOrder = By.xpath("//div[text()='Заказ оформлен']");

        public MakeOrder(WebDriver driver) {
            super(driver);
        }

        public void clickOnYesButton() {
            driver.findElement(yesButton).click();
        }

        public void waitOfModal() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOfElementLocated(modalOfOrder));
            driver.findElement(modalOfOrder).getText();
        }

        public void makeOrderAndCheckModal() {
            clickOnYesButton();
            waitOfModal();
        }
}
