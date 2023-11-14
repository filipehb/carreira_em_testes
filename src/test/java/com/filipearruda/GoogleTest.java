package com.filipearruda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleTest {
    private WebDriver driver;

    //Esse metodo é chamado apenas uma vez
    @BeforeAll
    public static void setupWebdriverChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
    }

    //Esse metodo é chamado a cada teste que é iniciado
    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }

    //Esse metodo é chamado a cada teste que é finalizado
    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit(); //Fecha o driver do chrome
        }
    }

    @Test
    public void testPesquisaNoGoogle() {
        //Given
        //Navego até o site do google
        driver.get("https://www.google.com/");

        //When
        //Preenche o campo de pesquisa com o texto ifpe
        driver.findElement(By.id("APjFqb")).sendKeys("ifpe");
        //Faço a ação de submeter um formulário
        driver.findElement(By.id("APjFqb")).submit();

        //Then
        // Aguarde até que a página contenha o texto "IFPE"
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Espere até 10 segundos no máximo
        wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("IFPE")));
        //Verifico se na página contem a palavra IFPE
        assertTrue(driver.getPageSource().contains("IFPE"));
    }
}
