package agon.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuButtonTest {

    @Test
    public void checkMenuButton() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://agonagon.ru/");

        // Ищем кнопку "Меню" по тексту или CSS-селектору
        WebElement menuButton = driver.findElement(By.linkText("Меню"));
        Assertions.assertNotNull(menuButton, "Кнопка 'Меню' не найдена!");

        driver.quit();
    }
}
