package team.bravo.yandreeva.HW11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class BrowserTest {
    @Test
    public void simpleTest() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
            System.out.println("Title: " + driver.getTitle());

            WebElement textBox = driver.findElement(By.name("my-text"));
            textBox.sendKeys("Selenium");
            System.out.println("Typed: " + textBox.getAttribute("value"));

            List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
            System.out.println("Checkboxes on page: " + checkboxes.size());

            WebElement submitButton = driver.findElement(By.cssSelector("button"));
            submitButton.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
            System.out.println("Message: " + message.getText());
        } finally {
            driver.quit();
        }
    }
}