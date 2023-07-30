package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.*;
import static config.Constants.URL;

public class MainPage extends BasePage {

    private final static SelenideElement mainNewsBtn = $x("//a[contains(., 'Самое читаемое')]");
    private final static SelenideElement hotNewsBtn = $x("//a[contains(., 'Последние новости')]");
    private final static SelenideElement failedElement = $x("//btn[@class = 'notExist']");


    @Step(value = "Открытие главной страницы")
    public MainPage openMainPage(){
        open(URL);
        return this;
    }

    @Step(value = "Открытия списка главных новостей")
    public ListOfMainNewsPage openListOfMainNews(){
        mainNewsBtn.shouldBe(Condition.visible)
                .shouldBe(Condition.exist)
                .click();
        return new ListOfMainNewsPage();
    }

    @Step(value = "Проверка открытия главной страницы")
    public MainPage checkMainPageIsOpen(){
        Assertions.assertEquals(title(), "Новости Пестречинская газета Вперед Пестречинский район");
        return this;
    }

    @Step(value = "Специально упавший шаг проверки открытия главной страницы")
    public MainPage failedCheckMainPageIsOpen(){
        failedElement.shouldBe(Condition.exist)
                .click();
        return this;
    }

    @Step(value = "Открытие списка горячих новостей")
    public ListOfHotNewsPage openListOfHotNews(){
        hotNewsBtn.shouldBe(Condition.visible)
                .shouldBe(Condition.exist)
                .click();
        return new ListOfHotNewsPage();
    }
}