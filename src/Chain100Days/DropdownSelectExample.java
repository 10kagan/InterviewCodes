package Chain100Days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("country"));

        Select select = new Select(dropdown);

        select.deselectByVisibleText("United States");

        driver.quit();
    }
}

// Select an option from a dropdown using Select class