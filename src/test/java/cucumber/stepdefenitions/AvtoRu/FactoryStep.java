package cucumber.stepdefenitions.AvtoRu;

import com.github.e999or.aitekolesson29.AvtoRu.FactoryAvtoPage;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class FactoryStep {

    FactoryAvtoPage factoryAvtoPage =new FactoryAvtoPage();

    @Когда("Переход осуществлен. Отображается кнопка с текстом, содержащим количество объявлений из п2.")
    public void checkButtonContent() {
        factoryAvtoPage.checkButtonFactoryAP();
    }

    @Тогда("Сохранить количество объявлений {string}")
    public void checkPost(String carBrend) {
        factoryAvtoPage.checkPostFactoryAP(carBrend);
    }

    @Когда("Перейти на страницу марки из п4")
    public void openPageCarBrend() {
        factoryAvtoPage.openPageCB();
    }
}
