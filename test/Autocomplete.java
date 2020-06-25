import okio.Timeout;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/oldie/workspace/Drivers/chromedriver24103");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");



        WebElement autocomplete = driver.findElement(By.xpath("//a[@class='btn btn-lg'][contains(text(),'Autocomplete')]"));
        autocomplete.click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Autocomplete')]")));
        String autoCompletePage = driver.getWindowHandle();
        driver.switchTo().window(autoCompletePage);

        WebElement autocomplete1 = driver.findElement(By.id("autocomplete"));
        autocomplete1.sendKeys("103 Gallagher ct, Morrisville, NC");





        }
}
