package agon.form;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    @Test
    public void validLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://agonagon.ru/");

        // Находим и кликаем по кнопке "Войти"
        WebElement loginButton = driver.findElement(By.linkText("Войти"));
        loginButton.click();

        // Вводим логин и пароль
        driver.findElement(By.id("login")).sendKeys("validUser");
        driver.findElement(By.id("password")).sendKeys("validPassword");
        driver.findElement(By.id("submit")).click();

        // Проверяем, что вошли в аккаунт
        WebElement profile = driver.findElement(By.id("profile"));
        Assertions.assertNotNull(profile, "Профиль не найден!");

        driver.quit();
    }

    @Test
    public void invalidLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://agonagon.ru/");

        WebElement loginButton = driver.findElement(By.linkText("Войти"));
        loginButton.click();

        driver.findElement(By.id("login")).sendKeys("invalidUser");
        driver.findElement(By.id("password")).sendKeys("invalidPassword");
        driver.findElement(By.id("submit")).click();

        WebElement error = driver.findElement(By.id("error-message"));
        Assertions.assertNotNull(error, "Ошибка не показана!");

        driver.quit();
    }
}
