import org.junit.Assert;

import java.io.*;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.apache.commons.io.FileUtils.readFileToString;

public class onlineReceptionPage {

    private File downloaded;
    void enterDocuments() {
        $(byXpath("//*[@id=\"under-slider-menu\"]/div/a[8]")).click();
    }

    void enterExample(){
        $(byXpath("//*[@id=\"mCSB_1_container\"]/ul/li[1]/a")).click();
    }

    void downloadDoc() throws FileNotFoundException {
       downloaded = $(byXpath("//*[@id=\"tab1\"]/p[6]/a")).download();

    }

    void checkString() throws IOException {
        String doc = readFileToString(downloaded, "Windows-1251");
        Assert.assertTrue(doc.contains("Юсупов"));
    }

}
