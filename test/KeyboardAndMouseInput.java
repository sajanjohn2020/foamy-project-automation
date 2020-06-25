import com.sun.tools.doclint.Entity;
import com.sun.xml.internal.xsom.XSListSimpleType;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.nio.file.attribute.FileTime;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Filter;

public class KeyboardAndMouseInput {


    public static void main(String[] args) {

        String url = "https://formy-project.herokuapp.com/switch-window";
        System.setProperty("webdriver.chrome.driver", "/Users/oldie/workspace/Drivers/chromedriver24103");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("new-tab-button")).click();
        String mainWindow = driver.getWindowHandle();

        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> s1t = s1.iterator();

        while(s1t.hasNext()) {
            String newWindow = s1t.next();

            if(!mainWindow.equalsIgnoreCase(mainWindow)) {
                driver.switchTo().window(newWindow);
            }
        }

        driver.switchTo().window(mainWindow);
        driver.findElement(By.id("alert-button")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }

}
