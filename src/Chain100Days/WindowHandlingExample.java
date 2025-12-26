package Chain100Days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlingExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        String mainWindow = driver.getWindowHandle();

        driver.findElement(By.id("openWindow")).click();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows){
            if (!window.equals(mainWindow)){
                driver.switchTo().window(window);
                break;
            }
        }

        System.out.println("ew window title: " + driver.getTitle());

        driver.close();

        driver.switchTo().window(mainWindow);

        driver.quit();
    }
}


// Handle multiple browser windows in Selenium