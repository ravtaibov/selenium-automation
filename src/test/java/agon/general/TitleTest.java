package agon;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {

    @Test
    public void checkTitle() {
        // Указываем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\работа\\Desktop\\chromedriver-win64\\chromedriver.exe");

        // Создаём новый экземпляр браузера Chrome
        WebDriver driver = new ChromeDriver();

        // Открываем сайт
        driver.get("https://agonagon.ru/");

        // Получаем заголовок страницы
        String title = driver.getTitle();

        // 🔄 Выводим заголовок в консоль, чтобы узнать, какой он на самом деле
        System.out.println("Реальный заголовок страницы: " + title);

        // Закрываем браузер
        driver.quit();
    }
}
