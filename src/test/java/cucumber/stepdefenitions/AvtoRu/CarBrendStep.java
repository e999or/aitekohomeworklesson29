package cucumber.stepdefenitions.AvtoRu;

import com.github.e999or.aitekolesson29.AvtoRu.CarBrendPage;
import io.cucumber.java.ru.Тогда;

public class CarBrendStep {
    CarBrendPage carBrendPage = new CarBrendPage();
    @Тогда("Переход осуществлен. Отображается кнопка с текстом, содержащим количество объявлений модели из п4.")
    public void checkButtonCarBrendPage() {
        carBrendPage.checkButtonCarBP();
    }
}
