import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.font.Script;

public class Modal {

    public static void main(String[] args) {

        String url = "https://formy-project.herokuapp.com/modal";

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/oldie/workspace/Drivers/chromedriver24103");
        driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("modal-button")).click();
        WebElement closebutton = driver.findElement(By.id("close-button"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", closebutton);
        

    }
}
