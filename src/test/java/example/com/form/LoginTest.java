package example.com.form;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void checkAddToCart() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://agonagon.ru/");

        driver.findElement(By.xpath("//button[text()='ПО ПРЕДЗАКАЗУ']")).click();
        String cartTotal = driver.findElement(By.cssSelector(".cart-total")).getText();

        Assert.assertNotEquals("0 р.", cartTotal);

        driver.quit();
    }
}
