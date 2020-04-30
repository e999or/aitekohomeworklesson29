package cucumber.stepdefenitions.Sber;

import com.github.e999or.aitekolesson29.Sber.DepositsPage;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import java.util.List;

public class DepositsStep  {

    DepositsPage depositsPage = new DepositsPage();

    @Когда("в верхней панели меню сайта нажимаем кнопку Вклады.")
    public void clickDeposit() throws InterruptedException {
        depositsPage.clickDepositDsP();
    }

    @Тогда("переход осуществлен, название страницы {string}.")
    public void inspectTitle(String titleText) {
        depositsPage.chekTitleAbstract(titleText);
    }

    @Тогда("отображаются {int} чек-бокса")
    public void fourCheckBox(Integer sizeCheckBox, List<String> dataTable) throws InterruptedException {
        depositsPage.fourCheckBoxDsP(sizeCheckBox, dataTable);
    }

    @Тогда("Установлен чекбокс Онлайн ,отображается {int} вкладки")
    public void ceckParamOnLineTabs(Integer tabSize, List<String> dataTable) {
        depositsPage.checkParamOnLineTabsDsP(tabSize, dataTable);
    }

    @Когда("выбрать чек-боксы Хочу снять, Хочу пополнять.")
    public void clickCheckBox() {
        depositsPage.clickCheckBoxDsP();
    }

    @Тогда("во вкладах остались остался только")
    public void checkDeposit(List<String> dataTable) {
        depositsPage.checkDepositDsP(dataTable);
    }

    @Когда("нажать на кнопку {string} вклад Управляй.")
    public void pushButtonManag(String linkText) {
        depositsPage.takeLinkAbstrct(linkText);
        depositsPage.switchDP();
    }
}
