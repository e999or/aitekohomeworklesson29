package com.github.e999or.aitekolesson29.AvtoRu;

import io.qameta.allure.Step;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.$x;

public class CarBrendPage extends PostCount {

    String checkButton;
    @Step
    public void checkButtonCarBP() {
       checkButton = $x("//span[@class='ButtonWithLoader__content']").getAttribute("innerText").replaceAll("\\D+","");
       //Assert.assertEquals(checkButton, getPostC());
    }
}
