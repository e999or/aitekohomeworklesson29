package cucumber.stepdefenitions.Sber;

import com.github.e999or.aitekolesson29.Sber.AbstractPage;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Selenide.$;

public class Page {

    AbstractPage abstractPage = new AbstractPage();
    @Тогда("переход осуществлен, проверяем название страницы банка{string}.")
    public void chekDepositTitle(String titleText) {
        abstractPage.chekTitleAbstract(titleText);
        abstractPage.closeCookieWarning();
    }

    @Когда("нажать на вкладку {string} .")
    public void takeDepozitLink(String nameTab) {
        abstractPage.takeLinkAbstrct(nameTab);
    }
}
