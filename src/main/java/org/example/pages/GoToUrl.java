package org.example.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class GoToUrl {

    private WebDriver driver;

    public GoToUrl() {
        this.driver = new ChromeDriver();
    }

    public GoToUrl GoTo(String url){

        driver.get(url);
        driver.manage().window().maximize();
        System.out.println(1);
        return this;
    }
    public GoToUrl ClickButton(String LinkText){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(LinkText)));
        webElement.click();
        System.out.println(2);
        return this;
    }
    public GoToUrl checkingElement(String id){
        WebDriverWait popUpWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement Clickable = popUpWait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
        Clickable.click();
        System.out.println(4);
        return this;
    }
    public String GetUrl(){
        return driver.getCurrentUrl();
    }

}
