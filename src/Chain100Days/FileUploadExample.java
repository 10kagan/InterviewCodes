package Chain100Days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/upload");

        WebElement uploadInput = driver.findElement(By.id("file-upload"));

        uploadInput.sendKeys("/Users/username/Desktop/testfile.txt");

        driver.findElement(By.id("submit")).click();

        driver.quit();
    }
}

// Upload a file using sendKeys in Selenium