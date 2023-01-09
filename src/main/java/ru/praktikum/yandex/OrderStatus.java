package ru.praktikum.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatus {
    public OrderStatus(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;

    private final By orderInformation = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public boolean orderStatusText() {
        return webDriver.findElement(orderInformation).isDisplayed();
    }
}
