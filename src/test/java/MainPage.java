import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.print.Doc;
import java.io.*;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.apache.commons.io.FileUtils.readFileToString;
import static org.junit.Assert.assertTrue;

public class MainPage {

    private File downloaded;
    void enterPerformanceButton() {
        $(byXpath("//*[@id=\"main-blocks\"]/div[1]/div[6]/a")).shouldHave(Condition.exactText("Успеваемость"));
    }

    void enterPerformance() {
        $(byXpath("//*[@id=\"main-blocks\"]/div[1]/div[6]/a")).click();
    }

    void enterAboutMeButton(){
        $(byXpath("//*[@id=\"under-slider-menu\"]/div/a[2]")).should(exist);
    }

    void enterAboutMe() {
        $(byXpath("//*[@id=\"under-slider-menu\"]/div/a[2]")).click();
    }



    void enterReception(){
        $(byXpath("//*[@id=\"under-slider-menu\"]/div/a[4]")).click();
    }



}
