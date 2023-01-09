package ru.praktikum.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderSecondPage {
    public OrderSecondPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;

    private  By deliveryDate = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private  By holdTime = By.className("Dropdown-placeholder");
    private  By oneDay = By.xpath(".//*[text()='сутки']");
    private  By twoDays = By.xpath(".//*[text()='двое суток']");
    private  By threeDays = By.xpath(".//*[text()='трое суток']");
    private  By fourDays = By.xpath(".//*[text()='четверо суток']");
    private  By fiveDays = By.xpath(".//*[text()='пятеро суток']");
    private  By sixDays = By.xpath(".//*[text()='шестеро суток']");
    private  By sevenDays = By.xpath(".//*[text()='семеро суток']");
    private  By colourBoxBlack = By.xpath(".//input[@id='black']");
    private  By colourBoxGrey = By.xpath(".//input[@id='grey']");
    private  By commentForDelivery = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private  By orderButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    private  By backButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Назад']");

    public void setDeliveryDate(String text) {
        webDriver.findElement(deliveryDate).sendKeys(text);
        webDriver.findElement(deliveryDate).sendKeys(Keys.ENTER);
    }

    public void setHoldTimeOneDay(){
        webDriver.findElement(holdTime).click();
        webDriver.findElement(oneDay).isDisplayed();
        webDriver.findElement(oneDay).click();
    }

    public void setHoldTimeTwoDays(){
        webDriver.findElement(holdTime).click();
        webDriver.findElement(twoDays).isDisplayed();
        webDriver.findElement(oneDay).click();
    }

    public void setHoldTimeThreeDays(){
        webDriver.findElement(holdTime).click();
        webDriver.findElement(threeDays).isDisplayed();
        webDriver.findElement(oneDay).click();
    }

    public void setHoldTimeFourDays(){
        webDriver.findElement(holdTime).click();
        webDriver.findElement(fourDays).isDisplayed();
        webDriver.findElement(oneDay).click();
    }

    public void setHoldTimeFiveDays(){
        webDriver.findElement(holdTime).click();
        webDriver.findElement(fiveDays).isDisplayed();
        webDriver.findElement(oneDay).click();
    }

    public void setHoldTimeSixDays(){
        webDriver.findElement(holdTime).click();
        webDriver.findElement(sixDays).isDisplayed();
        webDriver.findElement(oneDay).click();
    }

    public void setHoldTimeSevenDays(){
        webDriver.findElement(holdTime).click();
        webDriver.findElement(sevenDays).isDisplayed();
        webDriver.findElement(oneDay).click();
    }

    public void clickConfirmOrderButton(){
        webDriver.findElement(orderButton).click();
    }


}