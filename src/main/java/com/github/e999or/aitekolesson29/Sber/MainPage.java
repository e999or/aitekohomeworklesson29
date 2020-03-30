package com.github.e999or.aitekolesson29.Sber;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class MainPage {


    public MainPage openSberBankMainPage() {
        Selenide.open("https://www.sberbank.ru");
        return this;
    }
}
