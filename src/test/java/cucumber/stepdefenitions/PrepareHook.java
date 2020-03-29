package cucumber.stepdefenitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrepareHook {

   @Before
    public void prepareBrauser(){
       WebDriverManager.chromedriver().setup();
       Configuration.browser = "chrome";
       Configuration.timeout = 10000;
//         ChromeDriverManager.getInstance(CHROME).setup();
//       Configuration.browser = "chrome";
  }

}
