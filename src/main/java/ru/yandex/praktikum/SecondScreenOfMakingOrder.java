package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondScreenOfMakingOrder extends BaseClass {
    private By calendar = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By dropdown = By.className("Dropdown-root");
    private By comment = By.xpath("//input[@placeholder='Комментарий для курьера']");
    private By orderButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");

    public SecondScreenOfMakingOrder(WebDriver driver) {
        super(driver);
    }

    public void setData(String userData) {
        driver.findElement(calendar).sendKeys(userData);
        driver.findElement(By.className("Order_Content__bmtHS")).click();
    }

    public void setDays(int number) {
        driver.findElement(dropdown).click();
        driver.findElement(By.xpath(String.format("//div[@class='Dropdown-menu']/div[%s]", number))).click();
    }

    public void setColor(String color) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']", color))).click();
    }

    public void setComment(String userComment) {
        driver.findElement(comment).sendKeys(userComment);
    }

    public void clickOnOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void fillAllFields(String userData, int number, String color, String userComment) {
        setData(userData);
        setDays(number);
        setColor(color);
        setComment(userComment);
        clickOnOrderButton();
    }

}
