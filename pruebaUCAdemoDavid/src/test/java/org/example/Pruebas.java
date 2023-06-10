package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Pruebas {

    public WebDriver driver;

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void clickBuscarConFirefox(){
        WebElement User;
        WebElement Password;
        WebElement BtnLogin;
        WebElement BtnAdd;
        WebElement BtnAdd2;
        WebElement BtnDelete;
        WebElement BtnCar;
        WebElement Checkout;

        User = driver.findElement(By.cssSelector("#user-name"));
        User.click();
        User.sendKeys("standard_user");
        Password = driver.findElement(By.cssSelector("#password"));
        Password.click();
        Password.sendKeys("secret_sauce");
        BtnLogin = driver.findElement(By.cssSelector("#login-button"));
        BtnLogin.click();
        BtnAdd = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
        BtnAdd.click();
        BtnAdd2 = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light"));
        BtnAdd2.click();
        BtnDelete = driver.findElement(By.cssSelector("#remove-sauce-labs-backpack"));
        BtnDelete.click();
        BtnCar = driver.findElement(By.cssSelector("#shopping_cart_container > a"));
        BtnCar.click();
        Checkout = driver.findElement(By.cssSelector("#checkout"));
        Checkout.click();




    }
    @Test
    public void test(){
        setUp();
        clickBuscarConFirefox();
        //driver.quit();
    }
}
