package ru.praktikum.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderFirstPage {
    public OrderFirstPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;

    private By firstName = By.xpath(".//input[@placeholder='* Имя']");
    private By secondName = By.xpath("//input[@placeholder='* Фамилия']");
    private By customerAddress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStation = By.className("select-search__input");
    private By customerNumber = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By firstNextButton = By.xpath("//button[text()='Далее']");

    public void setFirstName(String text){
        webDriver.findElement(firstName).sendKeys(text);
    }
    public void setSecondName(String text){
        webDriver.findElement(secondName).sendKeys(text);
    }
    public void setCustomerAddress(String text){
        webDriver.findElement(customerAddress).sendKeys(text);
    }
    public void setMetroStation(){
        webDriver.findElement(metroStation).isDisplayed();
        webDriver.findElement(metroStation).sendKeys(Keys.ARROW_DOWN);
        webDriver.findElement(metroStation).sendKeys(Keys.ENTER);
    }
    public void setCustomerNumber(String text){
        webDriver.findElement(customerNumber).sendKeys(text);
    }
    public void clickOnFirstNextButton(){
        webDriver.findElement(firstNextButton).click();
    }
}
