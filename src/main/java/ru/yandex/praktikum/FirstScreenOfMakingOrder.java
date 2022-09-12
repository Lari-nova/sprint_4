package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstScreenOfMakingOrder extends BaseClass {

    private By name = By.xpath("//input[@placeholder='* Имя']");
    private By secondName = By.xpath("//input[@placeholder='* Фамилия']");
    private By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStation = By.xpath("//input[@placeholder='* Станция метро']");
    private By phone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By button = By.xpath("//div[@class='Order_NextButton__1_rCA']/button");

    public FirstScreenOfMakingOrder(WebDriver driver) {
        super(driver);
    }

    public void setName(String userName) {
        driver.findElement(name).sendKeys(userName);
    }

    public void setSecondName(String userSecondName) {
        driver.findElement(secondName).sendKeys(userSecondName);
    }

    public void setAddress(String userAddress) {
        driver.findElement(address).sendKeys(userAddress);
    }

    public void setMetroStation(String userMetroStation) {
        driver.findElement(metroStation).sendKeys(userMetroStation);
        driver.findElement(By.className("select-search__select")).click();
    }

    public void setPhone(String userPhone) {
        driver.findElement(phone).sendKeys(userPhone);
    }

    public void clickOnNextButton() {
        driver.findElement(button).click();
    }

    public void fillAllFields(String userName, String userSecondName,
                              String userAddress, String userMetroStation,
                              String userPhone) {
        setName(userName);
        setSecondName(userSecondName);
        setAddress(userAddress);
        setMetroStation(userMetroStation);
        setPhone(userPhone);
        clickOnNextButton();
    }
}
