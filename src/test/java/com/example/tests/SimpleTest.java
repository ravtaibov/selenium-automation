package agon;  // 👈 Это путь к файлу, проверь, чтобы совпадал!

import org.junit.jupiter.api.Assertions;    // JUnit 5 для тестов
import org.junit.jupiter.api.Test;          // Аннотация @Test из JUnit 5
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;  // WebDriverManager для драйверов

class TitleTest1 {  // 👈 Имя класса совпадает с именем файла!

    @Test
    public void checkTitle() {  // 👈 Открывающая фигурная скобка должна быть здесь!
        WebDriverManager.chromedriver().setup();   // Автоматическая загрузка драйвера
        WebDriver driver = new ChromeDriver();     // Создаём экземпляр браузера Chrome
        driver.get("https://agonagon.ru/");        // Переходим на сайт

        String title = driver.getTitle();          // Получаем заголовок страницы
        System.out.println("Заголовок страницы: " + title);  // Выводим заголовок в консоль

        Assertions.assertEquals("АГОНЬ – Ресторан", title);  // Проверяем заголовок

        driver.quit();  // Закрываем браузер
    }  // 👈 Закрывающая скобка метода checkTitle
}  // 👈 Закрывающая скобка класса TitleTest
