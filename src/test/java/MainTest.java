import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest extends BaseTest{

    @Test
    @DisplayName("Открытие главной новости")
    public void testOpenArticleFromListOfMainNews(){
        mainPage.openListOfMainNews()
                .checkNewsCount(15)
                .clickOnNews(0)
                .checkUrl("http://pestrecy-rt.ru/news");
    }

    @Test
    @DisplayName("Првоерка количества новостей")
    public void testOpenListOfCategoryNewsFromHotNews(){
        mainPage.openListOfHotNews()
                .checkNewsCount(15);
    }

    @Test
    @DisplayName("Проверка приписки Татмедиа")
    public void testArticleTextContains(){
        mainPage.openListOfMainNews()
                .clickOnNews(1)
                .checkContainsText("Следите за самым важным и интересным в Telegram-каналеТатмедиа");
    }

    @Test
    @DisplayName("Проверка рубркики Общество")
    public void testArticleSocial(){
        mainPage.openListOfMainNews()
                .clickOnNews(0)
                .checkContainsText("ОБЩЕСТВО");
    }
}