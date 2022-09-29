package org.example;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
         /*But the path to the chrome driver is already in the "path" for my user, so this line is not really needed*/
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://avic.ua/");
    }
}
