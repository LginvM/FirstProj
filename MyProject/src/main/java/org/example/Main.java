package org.example;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.setProperty("chromedriver","C:\\Users\\reg\\Desktop\\Тестирование\\auto\\chromedriver_win32");

        WebDriver driver = new ChromeDriver();

        try {
            // Открываем главную страницу Google
            driver.get("https://www.google.com");

            // Находим поле поиска по атрибуту XPath и вводим текст
            WebElement searchBox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
            searchBox.sendKeys("funny cats");

            // Enter
            searchBox.sendKeys(Keys.RETURN);

            WebElement searchButton = driver.findElement(By.xpath("//div[contains(text(), 'Images')]"));
            searchButton.click();

            // ждем, чтобы увидеть результаты (можно добавить явное ожидание)
            Thread.sleep(20000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрываем браузер
            driver.quit();
        }
    }
}