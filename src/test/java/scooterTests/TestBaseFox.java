package scooterTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBaseFox {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}