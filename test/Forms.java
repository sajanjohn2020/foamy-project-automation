import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ConfirmationPage;
import pages.FormPage;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Forms {


    public static void main(String[] args) {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/oldie/workspace/Drivers/chromedriver24103");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");

        driver.switchTo().window(goToFormPage(driver));

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        //System.out.println(confirmationPage.getSubmitResult(driver));

       assertEquals("The form was successfully submitted!", confirmationPage.getSubmitResult(driver));


    }

    public static String goToFormPage(WebDriver driver) {

        driver.findElement(By.xpath("//a[@class='btn btn-lg'][contains(text(),'Complete Web Form')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver.getWindowHandle();


    }








}