package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.*;

public class ArticlePage extends BasePage {

    private SelenideElement body = $x("//main");

    @Step("Проверка url")
    public void checkUrl(String url){
        Assertions.assertTrue(WebDriverRunner.getWebDriver().getCurrentUrl().contains(url));
    }

    @Step("Проверка содержания текста")
    public void checkContainsText(String text){
        Assertions.assertTrue(body.text().contains(text));
    }

}