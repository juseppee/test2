

import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {


    void chooseFile(){
        $(byXpath("//*[@id=\"info\"]/div/div[1]/div[1]/div[1]/form/div[1]/input")).uploadFile(new File("C:\\Users\\Danil\\Desktop\\300px.png"));
    }

    @Step("Проверка подтверждения добавления файла")
    void confirmFile(){
        $(byXpath("//*[@id=\"info\"]/div/div[1]/div[1]/div[1]/form/div[2]/input")).should(exist).click();
    }

    void deletePhoto(){
        $(byXpath("//*[@id=\"info\"]/div/div[1]/div[1]/div[2]/div[2]")).click();
        $(byXpath("//*[@id=\"answer\"]/a[1]")).click();
    }

}
