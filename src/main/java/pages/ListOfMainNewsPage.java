package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import pages.ArticlePage;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class ListOfMainNewsPage extends BasePage {

    private final static ElementsCollection listOfNews = $$(".all-news__list");

    @Step(value = "Проверка количества новостей")
    public ListOfMainNewsPage checkNewsCount(int size){
        Assertions.assertEquals(size, listOfNews.size());
        return this;
    }

    @Step(value = "Открытие новости")
    public ArticlePage clickOnNews(Integer number){
        listOfNews.get(number).shouldBe(Condition.visible)
                .shouldBe(Condition.exist)
                .click();
        return new ArticlePage();
    }
}