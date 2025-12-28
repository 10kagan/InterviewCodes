package Chain100Days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/login");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        username.sendKeys("testuser");

        WebElement passwprd = driver.findElement(By.id("passwprd"));
        passwprd.sendKeys("passwprd");

        WebElement loginButton = driver.findElement(By.id("loginBtn"));
        loginButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("logoutBtn")

        System.out.println("Login Successfully");

        driver.quit();
    }
}

// Write a Selenium script to login to a website