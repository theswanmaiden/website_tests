import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TabBarTest extends BaseTest {

    @Test
    @DisplayName("Проверка переходам по страницам таб бара")
    public void choicesTabBars() {
        mainPage.tabBarOpenTvPage()
                .tabBarOpenPhotosPage()
                .tabBarOpenAdvPage()
                .tabBarOpenMainPage()
                .checkMainPageIsOpen();
    }

    @Test
    @DisplayName("Проверка загаловка телевидения")
    public void tvTitle() {
        mainPage.tabBarOpenTvPage().checkTitle("телевидение");
    }

    @Test
    @DisplayName("Проверка загаловка фотогалереи")
    public void photoTitle() {
        mainPage.tabBarOpenPhotosPage().checkTitle("Слайдер");
    }

    @Test
    @DisplayName("Проверка загаловка рекламодателям")
    public void advTitle() {
        mainPage.tabBarOpenAdvPage().checkTitle("заметили");
    }

    @Test
    @DisplayName("Проверка загаловка главная")
    public void mainTitle() {
        mainPage.tabBarOpenTvPage().tabBarOpenMainPage().checkTitle("Новости");
    }

    @Test
    @DisplayName("Специально упавший тест для проверки показания скриншота")
    public void failedTest() {
        mainPage.failedCheckMainPageIsOpen();
    }
}