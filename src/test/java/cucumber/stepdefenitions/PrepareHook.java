package cucumber.stepdefenitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

public class PrepareHook {

    @Before
    public void prepareBrauser(){
        Configuration.browser = "chrome";
        System.setProperty("selenide.browser", "chrome");
    }

}
