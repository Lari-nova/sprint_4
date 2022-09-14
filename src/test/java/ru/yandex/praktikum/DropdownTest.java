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
    public void checkActivityOne() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickAndScroll();

        DropdownImportantQuestions dropdownQuestions = new DropdownImportantQuestions(
                driver, String.format("accordion__heading-%s", 0),
                String.format("accordion__panel-%s", 0)
        );
        dropdownQuestions.clickOnAccordionHeaderOne();
        MatcherAssert.assertThat(dropdownQuestions.getAccordionText(), is(answers[0]));
    }

    @Test
    public void checkActivityTwo() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickAndScroll();

        DropdownImportantQuestions dropdownQuestions = new DropdownImportantQuestions(
                driver, String.format("accordion__heading-%s", 1),
                String.format("accordion__panel-%s", 1)
        );
        dropdownQuestions.clickOnAccordionHeaderOne();
        MatcherAssert.assertThat(dropdownQuestions.getAccordionText(), is(answers[1]));
    }

    @Test
    public void checkActivityThree() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickAndScroll();

        DropdownImportantQuestions dropdownQuestions = new DropdownImportantQuestions(
                driver, String.format("accordion__heading-%s", 2),
                String.format("accordion__panel-%s", 2)
        );
        dropdownQuestions.clickOnAccordionHeaderOne();
        MatcherAssert.assertThat(dropdownQuestions.getAccordionText(), is(answers[2]));
    }

    @Test
    public void checkActivityFour() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickAndScroll();

        DropdownImportantQuestions dropdownQuestions = new DropdownImportantQuestions(
                driver, String.format("accordion__heading-%s", 3),
                String.format("accordion__panel-%s", 3)
        );
        dropdownQuestions.clickOnAccordionHeaderOne();
        MatcherAssert.assertThat(dropdownQuestions.getAccordionText(), is(answers[3]));
    }

    @Test
    public void checkActivityFive() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickAndScroll();

        DropdownImportantQuestions dropdownQuestions = new DropdownImportantQuestions(
                driver, String.format("accordion__heading-%s", 4),
                String.format("accordion__panel-%s", 4)
        );
        dropdownQuestions.clickOnAccordionHeaderOne();
        MatcherAssert.assertThat(dropdownQuestions.getAccordionText(), is(answers[4]));
    }

    @Test
    public void checkActivitySix() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickAndScroll();

        DropdownImportantQuestions dropdownQuestions = new DropdownImportantQuestions(
                driver, String.format("accordion__heading-%s", 5),
                String.format("accordion__panel-%s", 5)
        );
        dropdownQuestions.clickOnAccordionHeaderOne();
        MatcherAssert.assertThat(dropdownQuestions.getAccordionText(), is(answers[5]));
    }

    @Test
    public void checkActivitySeven() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickAndScroll();

        DropdownImportantQuestions dropdownQuestions = new DropdownImportantQuestions(
                driver, String.format("accordion__heading-%s", 6),
                String.format("accordion__panel-%s", 6)
        );
        dropdownQuestions.clickOnAccordionHeaderOne();
        MatcherAssert.assertThat(dropdownQuestions.getAccordionText(), is(answers[6]));
    }

    @Test
    public void checkActivityEight() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage.clickAndScroll();

        DropdownImportantQuestions dropdownQuestions = new DropdownImportantQuestions(
                driver, String.format("accordion__heading-%s", 7),
                String.format("accordion__panel-%s", 7)
        );
        dropdownQuestions.clickOnAccordionHeaderOne();
        MatcherAssert.assertThat(dropdownQuestions.getAccordionText(), is(answers[7]));
    }
}
