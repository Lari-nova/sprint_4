package ru.yandex.praktikum.chrome.tests;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import ru.yandex.praktikum.DropdownImportantQuestions;

import static org.hamcrest.CoreMatchers.is;
import static ru.yandex.praktikum.constants.CONSTANT.answers;

public class DropdownTestChrome extends BaseUITestChrome{

    @Test
    public void checkActivity() {
        driver.get("https://qa-scooter.praktikum-services.ru/");

        driver.manage().deleteAllCookies();

        WebElement cookieButton = driver.findElement(By.className("App_CookieButton__3cvqF"));
        cookieButton.click();

        WebElement dropdown = driver.findElement(By.className("Home_FourPart__1uthg"));

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", dropdown);

        for (int i = 0; i <= 7; i++) {
            DropdownImportantQuestions dropdownQuestions = new DropdownImportantQuestions(
                    driver, String.format("accordion__heading-%s", i),
                    String.format("accordion__panel-%s", i)
            );
            dropdownQuestions.clickOnAccordionHeaderOne();
            MatcherAssert.assertThat(dropdownQuestions.getAccordionText(), is(answers[i]));
        }
    }
}
