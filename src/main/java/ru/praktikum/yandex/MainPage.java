package ru.praktikum.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Главная страница
public class MainPage {
    public MainPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;
    //локатор для печеньки
    private final By cookieButton = By.id("rcc-confirm-button");
    //кнопка "заказать" вверху страницы
    private final By upperOrderButton = By.className("Button_Button__ra12g");
    //кнопка "заказать" внизу страницы
    private final By lowerOrderButton = By.className("Button_Middle__1CSJM");
    //локатор для 1-го выпадающего текста из списка "Вопросы о важном"
    private final By firstImportantQuestion = By.id("accordion__heading-0");
    //локатор для 2-го выпадающего текста из списка "Вопросы о важном"
    private final By secondImportantQuestion = By.id("accordion__heading-1");
    //локатор для 3-го выпадающего текста из списка "Вопросы о важном"
    private final By thirdImportantQuestion = By.id("accordion__heading-2");
    //локатор для 4-го выпадающего текста из списка "Вопросы о важном"
    private final By fourthImportantQuestion = By.id("accordion__heading-3");
    //локатор для 5-го выпадающего текста из списка "Вопросы о важном"
    private final By fifthImportantQuestion = By.id("accordion__heading-4");
    //локатор для 6-го выпадающего текста из списка "Вопросы о важном"
    private final By sixthImportantQuestion = By.id("accordion__heading-5");
    //локатор для 7-го выпадающего текста из списка "Вопросы о важном"
    private final By seventhImportantQuestion = By.id("accordion__heading-6");
    //локатор для 8-го выпадающего текста из списка "Вопросы о важном"
    private By eighthImportantQuestion = By.id("accordion__heading-7");

    public void open(){
        webDriver.get("https://qa-scooter.praktikum-services.ru");
    }
    //метод для нажатия печеньки (он же наш баг)
    public void clickCookieButton() {
        webDriver.findElement(cookieButton).click();
    }
    //нажимаем на кнопку "заказать" вверху страницы
    public void clickOnUpperOrderButton(){
        webDriver.findElement(upperOrderButton).click();
    }
    //нажимаем на кнопку "заказать" внизу страницы
    public void clickOnLowerOrderButton(){
        webDriver.findElement(lowerOrderButton).click();
    }
    //нажимаем на первую 1-ю стрелочку в блоке "Вопросы о важном"
    public void clickOnFirstImportantQuestion(){
        webDriver.findElement(firstImportantQuestion).click();
    }
    //нажимаем на первую 2-ю стрелочку в блоке "Вопросы о важном"
    public void clickOnSecondImportantQuestion(){
        webDriver.findElement(secondImportantQuestion).click();
    }
    //нажимаем на первую 3-ю стрелочку в блоке "Вопросы о важном"
    public void clickOnThirdImportantQuestion(){
        webDriver.findElement(thirdImportantQuestion).click();
    }
    //нажимаем на первую 4-ю стрелочку в блоке "Вопросы о важном"
    public void clickOnFourthImportantQuestion(){
        webDriver.findElement(fourthImportantQuestion).click();
    }
    //нажимаем на первую 5-ю стрелочку в блоке "Вопросы о важном"
    public void clickOnFifthImportantQuestion(){
        webDriver.findElement(fifthImportantQuestion).click();
    }
    //нажимаем на первую 6-ю стрелочку в блоке "Вопросы о важном"
    public void clickOnSixthImportantQuestion(){
        webDriver.findElement(sixthImportantQuestion).click();
    }
    //нажимаем на первую 7-ю стрелочку в блоке "Вопросы о важном"
    public void clickOnSeventhImportantQuestion(){
        webDriver.findElement(seventhImportantQuestion).click();
    }
    //нажимаем на первую 8-ю стрелочку в блоке "Вопросы о важном"
    public void clickOnEighthImportantQuestion(){
        webDriver.findElement(eighthImportantQuestion).click();
    }
}
