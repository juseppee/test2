

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class LoginPage {

    void enterLoginSquare(){
        $(byXpath("//*[@id=\"top-panel\"]/div[1]/div[1]/a")).click();
    }

    void enterUserName(String name) {
        $(byXpath("//*[@id=\"eu_enter\"]/input[1]")).setValue(name);
    }

    void enterPassword(String pass) {
        $(byXpath("//*[@id=\"eu_enter\"]/input[2]")).setValue(pass);
    }

    void clickLogin() {
        $(byXpath("//*[@id=\"eu_enter\"]/input[3]")).click();
    }


}
