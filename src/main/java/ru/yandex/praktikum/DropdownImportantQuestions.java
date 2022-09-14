package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownImportantQuestions {
    private WebDriver driver;
    private By accordionHeaderOne;
    private By accordionText;

    public DropdownImportantQuestions (WebDriver driver, String accordionHeaderOne, String accordionText ) {
        this.driver = driver;
        this.accordionHeaderOne = By.id(accordionHeaderOne);
        this.accordionText = By.id(accordionText);
    }

    public void clickOnAccordionHeaderOne() {
        driver.findElement(accordionHeaderOne).click();
    }

    public String getAccordionText () {
        return driver.findElement(accordionText).getText();
    }
}
