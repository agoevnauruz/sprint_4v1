package scooterTests;

import org.junit.Test;
import ru.praktikum.yandex.*;

public class CheckOrderLowerButtonTest extends TestBaseChrome{

    @Test
    public void lowerOrderButtonTest(){
        MainPage mainPage = new MainPage(driver);

        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnLowerOrderButton();
        OrderFirstPage orderFirstPage = new OrderFirstPage(driver);

        orderFirstPage.setFirstName("Алехандро");
        orderFirstPage.setSecondName("Рафаело");
        orderFirstPage.setCustomerAddress("Большой кузнечный переулок, 8");
        orderFirstPage.setMetroStation();
        orderFirstPage.setCustomerNumber("+79888989889");
        orderFirstPage.clickOnFirstNextButton();

        OrderSecondPage orderSecondPage = new OrderSecondPage(driver);

        orderSecondPage.setDeliveryDate("23.01.2023");
        orderSecondPage.setHoldTimeFourDays();
        orderSecondPage.clickConfirmOrderButton();

        ConfirmOrder confirmOrder = new ConfirmOrder(driver);
        confirmOrder.clickYesButton();

        OrderStatus orderStatus = new OrderStatus(driver);
        orderStatus.orderStatusText();
    }
}
