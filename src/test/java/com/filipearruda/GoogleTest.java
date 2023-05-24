package com.filipearruda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class GoogleTest {
    private WebDriver driver;

    @BeforeAll
    public static void setupWebdriverChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void FazAlgo() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("ifpe");
        driver.findElement(By.id("APjFqb")).submit();
        Thread.sleep(4000);
        assertTrue(driver.getPageSource().contains("IFPE"));
    }
}
