import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class FirstTest {
        @Test
        public void firstTest () throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");

            WebDriver driver = new ChromeDriver(); // создаем драйвер

            driver.navigate().to("https://next.privat24.ua");

            Thread.sleep(3000);

            driver.findElement(By.xpath("//button[@data-qa-node='login']")).click();

           // Assert.assertEquals("https://next.privat24.ua/", driver.getCurrentUrl());

           // driver.quit();

            }
        }

