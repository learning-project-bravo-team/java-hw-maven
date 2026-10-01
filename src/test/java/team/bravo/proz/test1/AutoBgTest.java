package team.bravo.proz.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutoBgTest {

    @Test
    public void cookieExistenceTest() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.auto.bg/");
            System.out.println("Title: " + driver.getTitle());

            WebElement cookiescriptInjected = driver.findElement(By.id("cookiescript_injected"));
            System.out.println("Found cookiescript_injected: " + cookiescriptInjected.getText());
            WebElement cookiescriptClose = driver.findElement(By.id("cookiescript_close"));
            System.out.println("Found cookiescript_close: " + cookiescriptClose.getAccessibleName());
            WebElement cookiescriptHeader = driver.findElement(By.id("cookiescript_header"));
            System.out.println("Found cookiescript_header: " + cookiescriptHeader.getLocation());
            WebElement cookiescriptDescription = driver.findElement(By.id("cookiescript_description"));
            System.out.println("Found cookiescript_description: " + cookiescriptDescription.getAttribute("data-cs-i18n-text"));
            WebElement cookiescriptAccept = driver.findElement(By.id("cookiescript_accept"));
            System.out.println("Found cookiescript_accept: " + cookiescriptAccept.getTagName());
            WebElement cookiescriptReject = driver.findElement(By.id("cookiescript_reject"));
            System.out.println("Found cookiescript_reject: " + cookiescriptReject.getAccessibleName());

            //List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        } finally {
            driver.quit();
        }
    }
}