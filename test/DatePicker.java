
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

        public static void main(String[] args) {

            String url = "https://formy-project.herokuapp.com/fileupload";
            System.setProperty("webdriver.chrome.driver", "/Users/oldie/workspace/Drivers/chromedriver24103");
            WebDriver driver = new ChromeDriver();
            driver.get(url);

            WebElement fileUpload = driver.findElement(By.id("file-upload-field"));
            fileUpload.sendKeys("images/s_notice.png");
            driver.findElement(By.xpath("//button[@class='btn btn-warning btn-reset']")).click();



        }
    }
