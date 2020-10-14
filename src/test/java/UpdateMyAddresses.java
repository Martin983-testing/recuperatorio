import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateMyAddresses {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void updateMyAddress() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        Login.login("m.rost.91@gmail.com","123456" );

        String resultado_esperado = YourAddresses.Dirección ("1234567", "123456789", "Cordoba12", "UTNCordoba", "UTN AUTOMATION.");

        assertEquals("UTN AUTOMATION.", resultado_esperado);

}
}
