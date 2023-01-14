package ru.praktikum.yandex;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatus {
    public OrderStatus(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;

    private final By orderInformation = By.xpath(".//div[contains(@class, 'Order_ModalHeader')]");
    public boolean orderStatusText() {
        return webDriver.findElement(orderInformation).isDisplayed();
    }
}
