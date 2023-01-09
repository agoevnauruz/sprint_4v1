package scooterTests;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikum.yandex.*;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class CheckOrderUpperButtonTest extends TestBaseChrome{

    @Test
    public void upperOrderButtonTest(){
        MainPage mainPage = new MainPage(driver);

        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOnUpperOrderButton();

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
