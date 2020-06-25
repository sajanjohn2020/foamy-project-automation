import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) {

        String url = "https://formy-project.herokuapp.com/checkbox";

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/oldie/workspace/Drivers/chromedriver24103");
        driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("input[value='checkbox-2']")).click();
        driver.findElement(By.cssSelector("#checkbox-3")).click();


    }
}
