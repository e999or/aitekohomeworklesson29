package cucumber.stepdefenitions.Sber;

import com.github.e999or.aitekolesson29.Sber.DepositPage;
import io.cucumber.java.ru.Тогда;

public class DepostSteps {

    DepositPage managDeosit = new DepositPage();

    @Тогда("открылось окно с названием {string}.")
    public void checkTitleName(String titleText) {
        managDeosit.chekTitleAbstract(titleText);
    }

    @Тогда("странице отображается надпись {string}.")
    public void pageHaveDeposit(String text) {
        managDeosit.pageHaveDepositDepositPage(text);
    }
}
