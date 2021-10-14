import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.*;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;


public class kpfuTestTest {

    private static LoginPage loginPage;
    private static MainPage mainPage;
    private static ProfilePage profilePage;
    private static onlineReceptionPage onlineReceptionPage;

    @Before
    public void start(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        loginPage = new LoginPage();
        mainPage = new MainPage();
        profilePage = new ProfilePage();
        onlineReceptionPage = new onlineReceptionPage();
        open(ConfProperties.getProperty("site"));
        loginPage.enterLoginSquare();
        loginPage.enterUserName(ConfProperties.getProperty("login"));
        loginPage.enterPassword(ConfProperties.getProperty("password"));
        loginPage.clickLogin();
    }

    @After
    public void end(){
    }


    @Test
    public void enterAboutMe(){
        mainPage.enterAboutMeButton();
        mainPage.enterAboutMe();
    }

    @Test
    public void enterPerformance(){
        mainPage.enterPerformanceButton();
        mainPage.enterPerformance();
    }

    @Test
    public void uploadPhoto(){
        mainPage.enterAboutMe();
        profilePage.chooseFile();
        profilePage.confirmFile();
    }

    @Test
    public void deletePhoto(){
        mainPage.enterAboutMe();
        profilePage.deletePhoto();
    }

    @Test
    public void downloadFile() throws IOException {
        mainPage.enterReception();
        onlineReceptionPage.enterDocuments();
        onlineReceptionPage.enterExample();
        onlineReceptionPage.downloadDoc();
        onlineReceptionPage.checkString();
    }

}