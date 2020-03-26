package com.github.e999or.aitekolesson29.Sber;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class DepositPage extends AbstractPage{

    public DepositPage pageHaveDepositDepositPage(String string) {
        $(".kit-heading").shouldHave(attribute("innerText", string));
        return this;
    }
}
