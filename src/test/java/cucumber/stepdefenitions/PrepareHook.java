package cucumber.stepdefenitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrepareHook {

   @Before
    public void prepareBrauser(){
       WebDriverManager.chromedriver().setup();
       Configuration.browser = "chrome";
       Configuration.timeout = 20000;
    }

    @After
    public void ex(){
        WebDriverRunner.getWebDriver().close();
    }

}
