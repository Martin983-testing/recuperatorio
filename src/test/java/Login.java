import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import utils.WebDriverSupliter;

import static utils.WebDriverSupliter.getChromeDriver;

public class Login {

    public static void login(String email, String passwd){

        WebDriver driver = getChromeDriver();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(passwd);
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    }
}