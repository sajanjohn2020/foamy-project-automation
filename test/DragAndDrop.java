import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) {

        String url = "https://formy-project.herokuapp.com/dragdrop";
        System.setProperty("webdriver.chrome.driver", "/Users/oldie/workspace/Drivers/chromedriver24103");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement  source = driver.findElement(By.id("image"));
        WebElement target = driver.findElement(By.id("box"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target ).build().perform();

    }

}
