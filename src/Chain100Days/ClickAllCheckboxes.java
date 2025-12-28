package Chain100Days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClickAllCheckboxes {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/checkboxes");

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement checkbox : checkboxes){
            if(!checkbox.isSelected() && checkbox.isEnabled()){
                checkbox.click();
            }
        }
        driver.quit();
    }
}

// Click on all checkboxes in a page using Selenium