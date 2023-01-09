package ru.praktikum.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownTextStatus {
    public DropdownTextStatus(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;
    //локатор 1-го выпавшего текста
    public By firstDropdownText = By.xpath(".//div[@id='accordion__panel-0']/p");

    //локатор 2-го выпавшего текста
    private By secondDropdownText = By.xpath(".//div[@id='accordion__panel-1']/p");

    //локатор 3-го выпавшего текста
    private By thirdDropdownText = By.xpath(".//div[@id='accordion__panel-2']/p");

    //локатор 4-го выпавшего текста
    private By fourthDropdownText = By.xpath(".//div[@id='accordion__panel-3']/p");

    //локатор 5-го выпавшего текста
    private By fifthDropdownText = By.xpath(".//div[@id='accordion__panel-4']/p");

    //локатор 6-го выпавшего текста
    private By sixthDropdownText = By.xpath(".//div[@id='accordion__panel-5']/p");

    //локатор 7-го выпавшего текста
    private By seventhDropdownText = By.xpath(".//div[@id='accordion__panel-6']/p");

    //локатор 8-го выпавшего текста
    private By eighthDropdownText = By.xpath(".//div[@id='accordion__panel-7']/p");

    public boolean isFirstDropdownTextDisplayed(){
        return webDriver.findElement(firstDropdownText).isDisplayed();
    }

    public boolean isSecondDropdownTextDisplayed(){
        return webDriver.findElement(secondDropdownText).isDisplayed();
    }

    public boolean isThirdDropdownTextDisplayed(){
        return webDriver.findElement(thirdDropdownText).isDisplayed();
    }

    public boolean isFourthDropdownTextDisplayed(){
        return webDriver.findElement(fourthDropdownText).isDisplayed();
    }

    public boolean isFifthDropdownTextDisplayed(){
        return webDriver.findElement(fifthDropdownText).isDisplayed();
    }

    public boolean isSixthDropdownTextDisplayed(){
        return webDriver.findElement(sixthDropdownText).isDisplayed();
    }

    public boolean isSeventhDropdownTextDisplayed(){
        return webDriver.findElement(seventhDropdownText).isDisplayed();
    }

    public boolean isEighthDropdownTextDisplayed(){
        return webDriver.findElement(eighthDropdownText).isDisplayed();
    }
}
