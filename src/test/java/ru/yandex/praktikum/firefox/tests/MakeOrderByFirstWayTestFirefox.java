package ru.yandex.praktikum.firefox.tests;

import org.junit.Test;
import ru.yandex.praktikum.FirstScreenOfMakingOrder;
import ru.yandex.praktikum.MakeOrder;
import ru.yandex.praktikum.SecondScreenOfMakingOrder;
import ru.yandex.praktikum.TheFirstOrderButton;

public class MakeOrderByFirstWayTestFirefox extends BaseUITestFirefox {
    @Test
    public void checkProcessOfOrder() {
        driver.get("https://qa-scooter.praktikum-services.ru/");

        TheFirstOrderButton firstOrderButton = new TheFirstOrderButton(driver);
        firstOrderButton.clickOnCookieButton();
        firstOrderButton.clickOnOrderButton();

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
