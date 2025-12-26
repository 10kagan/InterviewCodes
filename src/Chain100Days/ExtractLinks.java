package Chain100Days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExtractLinks {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links){
            String url = link.getAttribute("href");
            System.out.println(url);
        }
        driver.quit();
    }
}

// Extract all links from a web page using Selenium