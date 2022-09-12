package ru.yandex.praktikum.firefox.tests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import ru.yandex.praktikum.FirstScreenOfMakingOrder;
import ru.yandex.praktikum.MakeOrder;
import ru.yandex.praktikum.SecondScreenOfMakingOrder;
import ru.yandex.praktikum.TheSecondOrderButton;

public class MakeOrderBySecondWayTestFirefox extends BaseUITestFirefox {
    @Test
    public void checkProcessOfOrder() {
        driver.get("https://qa-scooter.praktikum-services.ru/");

        TheSecondOrderButton secondOrderButton = new TheSecondOrderButton(driver);
        secondOrderButton.clickOnCookieButton();
        WebElement orderButton = secondOrderButton.findOnOrderButton();
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", orderButton);
        orderButton.click();

        FirstScreenOfMakingOrder firstScreen = new FirstScreenOfMakingOrder(driver);
        firstScreen.fillAllFields("Анастасия", "Ларионова",
                "улица Полины Осипенко, 22К2",
                "Комсомольская", "89531245879");


        SecondScreenOfMakingOrder secondScreen = new SecondScreenOfMakingOrder(driver);
        secondScreen.fillAllFields("08.10.2022", 3,
                "серая безысходность", "Не звоните, лучше напишите");

        MakeOrder makeOrder = new MakeOrder(driver);
        makeOrder.makeOrderAndCheckModal();
    }
}
