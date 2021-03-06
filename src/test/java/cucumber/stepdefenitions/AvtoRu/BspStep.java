package cucumber.stepdefenitions.AvtoRu;

import com.github.e999or.aitekolesson29.AvtoRu.MainPage;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class BspStep {

   private MainPage mainPage = new MainPage();

    @Дано("пользователь вводит в адресную строку браузера название сайта.")
    public void open() {
        mainPage.openAvtoMP();
    }

    @Когда("переход осуществлен, проверяем название страницы {string}.")
    public void checkNamePage(String title) {
        mainPage.chekTitleMP(title);
    }

    @Тогда("Сохранить количество объявлений, отображаемых перед названием {string}.")
    public void countPost(String factory) {
        mainPage.getCountPost(factory);
    }

    @Тогда("Перейти на страницу с объявлениям производителя автомобилей из п2.")
    public void clickFactoryAvtoPage() {
        mainPage.clickFactoryAP();
    }
}