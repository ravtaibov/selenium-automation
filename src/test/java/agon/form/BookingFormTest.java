package agon.form;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingFormTest {

    @Test
    public void checkBookingForm() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://agonagon.ru/");

        // Находим и кликаем по кнопке "Забронировать стол"
        WebElement bookingButton = driver.findElement(By.linkText("Забронировать стол"));
        bookingButton.click();

        // Проверяем, что форма загрузилась
        WebElement bookingForm = driver.findElement(By.id("booking-form"));
        Assertions.assertNotNull(bookingForm, "Форма бронирования не найдена!");

        driver.quit();
    }
}
