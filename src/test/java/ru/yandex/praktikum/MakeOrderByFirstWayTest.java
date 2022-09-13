package ru.yandex.praktikum;

import org.junit.Before;
import org.junit.Test;

public class MakeOrderByFirstWayTest extends BaseUITest {

    private TheFirstOrderButton firstOrderButton;
    private FirstScreenOfMakingOrder firstScreen;
    private SecondScreenOfMakingOrder secondScreen;
    private MakeOrder makeOrder;

    @Before
    public void initElements() {
        firstOrderButton = new TheFirstOrderButton(driver);
        firstScreen = new FirstScreenOfMakingOrder(driver);
        secondScreen = new SecondScreenOfMakingOrder(driver);
        makeOrder = new MakeOrder(driver);
    }

    @Test
    public void checkProcessOfOrder() {
        driver.get("https://qa-scooter.praktikum-services.ru/");

        firstOrderButton.clickOnCookieButton();
        firstOrderButton.clickOnOrderButton();

        firstScreen.fillAllFields("Анастасия", "Ларионова",
                "улица Полины Осипенко, 22К2",
                "Комсомольская", "89531245879");


        secondScreen.fillAllFields("08.10.2022", 3,
                "серая безысходность", "Не звоните, лучше напишите");

        makeOrder.makeOrderAndCheckModal();
    }
}
