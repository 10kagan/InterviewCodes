package Chain100Days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForVisibilityExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Element görünür olana kadar bekle
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("loginButton"))
        );

        element.click();

        driver.quit();
    }
}

// Wait for an element to be visible using WebDriverWait