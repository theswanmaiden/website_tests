package pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.util.Objects;

public class ListOfCategoryNewsPage extends BasePage{
    private final String categoryName;

    public ListOfCategoryNewsPage(String categoryName) {
        this.categoryName = categoryName;
    }

    @Step(value = "Проверка соответсвия категории")
    public ListOfCategoryNewsPage checkNameOfCategory(){
        Assertions.assertTrue(Objects.requireNonNull(Selenide.title().toUpperCase()).contains(categoryName));
        return this;
    }
}