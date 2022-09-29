package org.example;

import org.example.pages.GoToUrl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



import java.util.Objects;

public class BasicTest {
    @BeforeClass
    public static void precondition(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    }

    @Test
    public void myTest() {
        GoToUrl SomePage = new GoToUrl();
        SomePage.GoTo("https://avic.ua/ua")
                .ClickButton("Знижені в ціні товари")
                .ClickButton("Показати все");
                SomePage.GoTo("https://avic.ua/ua").checkingElement("js_popUp");
        String ActualUrl = SomePage.GoTo("https://avic.ua/ua").checkingElement("js_popUp").GetUrl();
        String ExpectedUrl = "https://avic.ua/ua/back-to-school-skidki-do-50";
        Assert.assertTrue(Objects.equals(ActualUrl, ExpectedUrl));
        System.out.println(5);




    }
}
