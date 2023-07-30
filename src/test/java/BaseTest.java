import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.MainPage;
import pages.SelenideSetup;


public class BaseTest {

    protected MainPage mainPage = new MainPage();


    @BeforeEach
    public void setUp() {
        SelenideSetup.webDriverSetUp();
        mainPage.openMainPage();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}