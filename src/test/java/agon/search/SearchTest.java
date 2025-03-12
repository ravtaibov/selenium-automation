package agon.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {

    @Test
    public void checkSearch() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://agonagon.ru/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("стейк");
        searchBox.submit();

        WebElement result = driver.findElement(By.className("search-result"));
        Assertions.assertNotNull(result, "Результаты поиска не найдены!");

        driver.quit();
    }
}
