import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import utils.WebDriverSupliter;

import static utils.WebDriverSupliter.getChromeDriver;

public class YourAddresses {


    public static String Dirección(String phone,String phone_mobile, String address1, String company, String alias) {
        WebDriver driver = getChromeDriver();

        driver.get("http://automationpractice.com/index.php?controller=address&id_address=390267");

        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys(phone);

        driver.findElement(By.id("phone_mobile")).clear();
        driver.findElement(By.id("phone_mobile")).sendKeys(phone_mobile);

        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys(address1);

        driver.findElement(By.id("company")).clear();
        driver.findElement(By.id("company")).sendKeys(company);

        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys(alias);

        driver.findElement(By.cssSelector("#submitAddress > span")).click();

        /*Se valida el cambio realizado. Se compara el valor del alias actualizado*/
        return driver.findElement(By.cssSelector(".page-subheading")).getText();


    }
}