package com.github.e999or.aitekolesson29.Sber;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public MainPage openSberBankMainPage() {
        Selenide.open("https://www.sberbank.ru");
        return this;
    }
}
