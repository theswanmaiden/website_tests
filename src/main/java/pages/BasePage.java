package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    private final static SelenideElement mainBtn = $x("//a[text()='Главная']");
    private final static SelenideElement tvBtn = $x("//a[text()='Пестречинское телевидение']");
    private final static SelenideElement photosBtn = $x("//a[text()='Фотогалереи']");
    private final static SelenideElement advBtn = $x("//a[text()='Рекламодателям']");

    @Step(value = "Переход на главный экран")
    public MainPage tabBarOpenMainPage() {
        mainBtn.shouldBe(Condition.exist)
                .shouldBe(Condition.visible)
                .click();
        return new MainPage();
    }

    @Step(value = "Переход на страницу ТВ")
    public BasePage tabBarOpenTvPage() {
        tvBtn.shouldBe(Condition.exist)
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    @Step(value = "Переход на страницу фото")
    public BasePage tabBarOpenPhotosPage() {
        photosBtn.shouldBe(Condition.exist)
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    @Step(value = "Переход на страницу рекламы")
    public BasePage tabBarOpenAdvPage() {
        advBtn.shouldBe(Condition.exist)
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    @Step(value = "Проверка загаловка")
    public void checkTitle(String title){
        Assertions.assertTrue(title().contains(title));
    }

}