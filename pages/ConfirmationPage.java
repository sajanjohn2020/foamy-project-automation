package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ConfirmationPage {

    public static void waitForAlertBanner(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-success']")));

    }


    public String getSubmitResult(WebDriver driver) {
        return driver.findElement(By.className("alert")).getText();
    }
}
