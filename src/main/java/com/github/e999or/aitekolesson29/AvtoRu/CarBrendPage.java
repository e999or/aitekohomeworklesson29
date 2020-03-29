package com.github.e999or.aitekolesson29.AvtoRu;

import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CarBrendPage extends PostCount {

    String checkButton;

    public void checkButtonCarBP() {
        getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       checkButton = $x("//span[@class='ButtonWithLoader__content']").getAttribute("innerText").replaceAll("\\D+","");
       //Assert.assertEquals(checkButton, getPostC());
    }
}
