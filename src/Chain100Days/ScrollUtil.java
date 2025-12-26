package Chain100Days;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ScrollUtil {

    // Sayfayı belirli piksel kadar aşağı kaydır
    public static void scrollDownByPixels(WebDriver driver, int pixels){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, arguments[0]);", pixels);
    }

    // Sayfanın en altına kaydır (Bottom)
    public static void scrollToBottom (WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    // Bir element görünür olana kadar kaydır (En pratik kullanım)
    public static void scrollIntoView (WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
    }

    // Infinite Scroll: İçerik bitene kadar aşağı kaydır
    public static void scrollToBottomUntilNoChange (WebDriver driver, int maxTries){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        long lastHeight = (long) js.executeScript("return document.body.scrollHeight;");

        for (int i = 0; i < maxTries; i++){
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                Thread.sleep(800);
            } catch (InterruptedException ignored) {

            }

            long newHeight = (long) js.executeScript("return document.body.scrollHeight;");
            if(newHeight == lastHeight){
                break;
            }
            lastHeight = newHeight;
        }
    }
}

// Scroll down a page using JavaScriptExecutor