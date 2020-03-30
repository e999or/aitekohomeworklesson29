package cucumber.stepdefenitions.Sber;

import com.codeborne.selenide.Configuration;
import com.github.e999or.aitekolesson29.Sber.MainPage;
import io.cucumber.java.ru.Дано;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    @Дано("пользователь вводит в адресную строку браузера название сайта Сбербанк.")
    public void openSberBank() {
        mainPage.openSberBankMainPage();
    }
}
