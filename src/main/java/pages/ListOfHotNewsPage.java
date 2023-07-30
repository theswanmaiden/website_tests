package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import pages.ArticlePage;
import pages.BasePage;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$$;

public class ListOfHotNewsPage extends BasePage {

    private final static ElementsCollection listOfNews = $$(".all-news__list");

    public ListOfHotNewsPage checkNewsCount(int size){
        Assertions.assertEquals(size, listOfNews.size());
        return this;
    }

    @Step(value = "Открытие случайной новости")
    public ArticlePage openRandomNews(){
        listOfNews.get(new Random().nextInt(16))
                .shouldBe(Condition.visible)
                .shouldBe(Condition.exist)
                .click();
        return new ArticlePage();
    }
}