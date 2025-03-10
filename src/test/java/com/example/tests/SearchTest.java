package agon;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

    @Test
    public void checkTitle() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://agonagon.ru/");

        String title = driver.getTitle();
        Assert.assertEquals("АГОНЬ – Ресторан", title);

        driver.quit();
    }
}
