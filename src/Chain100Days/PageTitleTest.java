package Chain100Days;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class PageTitleTest {

    @Test
    public void shouldVerifyPageTitle(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Example Domain";

        assertEquals(actualTitle, expectedTitle);

        driver.quit();
    }
}

// Verify the title of a web page using Selenium