import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLogin {

    public static void main(String[] args) {

        String url = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "/Users/oldie/workspace/Drivers/chromedriver24103");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement userName = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        userName.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        WebElement login = driver.findElement(By.className("radius"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", login);

        String newWindow = driver.getWindowHandle();
        driver.switchTo().window(newWindow);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a/i")).click();


    }



}
