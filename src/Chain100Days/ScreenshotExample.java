package Chain100Days;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenshotExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File("screenshot.png");
        Files.copy(source.toPath(), destination.toPath());

        driver.quit();
    }

    public static void takeScreenshot(WebDriver driver, String testName){

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(
                    src.toPath(),
                    new File("screenshots/" + testName + ".png").toPath()
            );
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

// Take a screenshot using Selenium WebDriver