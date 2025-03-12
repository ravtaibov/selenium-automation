package agon.navigation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactsPageTest {

    @Test
    public void checkContactsPage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://agonagon.ru/");

        // Находим и кликаем по ссылке "Контакты"
        WebElement contactsLink = driver.findElement(By.linkText("Контакты"));
        contactsLink.click();

        // Проверяем, что URL верный
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://agonagon.ru/contacts", currentUrl);

        driver.quit();
    }
}
