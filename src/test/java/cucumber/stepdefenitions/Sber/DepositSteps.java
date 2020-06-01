package cucumber.stepdefenitions.Sber;

import com.github.e999or.aitekolesson29.Sber.DepositPage;
import io.cucumber.java.ru.Тогда;

public class DepositSteps {

    DepositPage managDeposit = new DepositPage();

    @Тогда("открылось окно с названием {string}.")
    public void checkTitleName(String titleText) {
        managDeposit.chekTitleAbstract(titleText);
    }

    @Тогда("странице отображается надпись {string}.")
    public void pageHaveDeposit(String text) {
        managDeposit.pageHaveDepositDP(text);
    }
}
