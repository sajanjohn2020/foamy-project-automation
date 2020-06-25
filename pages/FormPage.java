package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

    public static void submitForm(WebDriver driver) {

        driver.findElement(By.id("first-name")).sendKeys("Joe");
        driver.findElement(By.id("last-name")).sendKeys("john");
        driver.findElement(By.id("job-title")).sendKeys("Engineer");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();

        WebElement yearsOfExperience = driver.findElement(By.id("select-menu"));

        Select select = new Select(yearsOfExperience);
        select.selectByVisibleText("5-9");

        driver.findElement(By.id("datepicker")).sendKeys("01/10/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

    }
}
