package ru.yandex.praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static ru.yandex.praktikum.constants.CONSTANT.answers;

public class DropdownTest extends BaseUITest {

    private MainPage mainPage;

    @Before
    public void initElements() {
        mainPage = new MainPage(driver);
    }

    @Test
    public void checkActivity() {
        driver.get("https://qa-scooter.praktikum-services.ru/");

        mainPage.clickAndScroll();

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
