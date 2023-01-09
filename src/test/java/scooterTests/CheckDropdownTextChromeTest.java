package scooterTests;

import org.junit.Test;
import ru.praktikum.yandex.DropdownTextStatus;
import ru.praktikum.yandex.MainPage;

import static org.junit.Assert.assertTrue;

public class CheckDropdownTextChromeTest extends TestBaseChrome {

    @Test
    public void checkFirstImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnFirstImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        boolean isDisplayed = dropdownTextStatus.isFirstDropdownTextDisplayed();
        assertTrue(isDisplayed);
    }

    @Test
    public void checkSecondImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnSecondImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        boolean isDisplayed = dropdownTextStatus.isSecondDropdownTextDisplayed();
        assertTrue(isDisplayed);
    }

    @Test
    public void checkThirdImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnThirdImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        boolean isDisplayed = dropdownTextStatus.isThirdDropdownTextDisplayed();
        assertTrue(isDisplayed);
    }

    @Test
    public void checkFourthImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnFourthImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        boolean isDisplayed = dropdownTextStatus.isFourthDropdownTextDisplayed();
        assertTrue(isDisplayed);
    }

    @Test
    public void checkFifthImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnFifthImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        boolean isDisplayed = dropdownTextStatus.isFifthDropdownTextDisplayed();
        assertTrue(isDisplayed);
    }

    @Test
    public void checkSixthImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnSixthImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        boolean isDisplayed = dropdownTextStatus.isSixthDropdownTextDisplayed();
        assertTrue(isDisplayed);
    }

    @Test
    public void checkSeventhImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnSeventhImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        boolean isDisplayed = dropdownTextStatus.isSeventhDropdownTextDisplayed();
        assertTrue(isDisplayed);
    }

    @Test
    public void checkEighthImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnEighthImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        boolean isDisplayed = dropdownTextStatus.isEighthDropdownTextDisplayed();
        assertTrue(isDisplayed);
    }
}
