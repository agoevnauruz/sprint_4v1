package scooterTests;

import org.junit.Test;
import ru.praktikum.yandex.DropdownTextStatus;
import ru.praktikum.yandex.MainPage;

import static org.junit.Assert.*;

public class CheckDropdownTextChromeTest extends TestBaseChrome {

    @Test
    public void checkFirstImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnFirstImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                dropdownTextStatus.isFirstDropdownTextDisplayed());
    }

    @Test
    public void checkSecondImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnSecondImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                dropdownTextStatus.isSecondDropdownTextDisplayed());
    }

    @Test
    public void checkThirdImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnThirdImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                dropdownTextStatus.isThirdDropdownTextDisplayed());
    }

    @Test
    public void checkFourthImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnFourthImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                dropdownTextStatus.isFourthDropdownTextDisplayed());
    }

    @Test
    public void checkFifthImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnFifthImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                dropdownTextStatus.isFifthDropdownTextDisplayed());
    }

    @Test
    public void checkSixthImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnSixthImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                dropdownTextStatus.isSixthDropdownTextDisplayed());
    }

    @Test
    public void checkSeventhImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnSeventhImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
                dropdownTextStatus.isSeventhDropdownTextDisplayed());
    }

    @Test
    public void checkEighthImportantQuestionContainsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnEighthImportantQuestion();

        DropdownTextStatus dropdownTextStatus = new DropdownTextStatus(driver);
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.",
                dropdownTextStatus.isEighthDropdownTextDisplayed());
    }
}
