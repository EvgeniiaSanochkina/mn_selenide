package pages;

import data.Data;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class MainPage {

    private SelenideElement cats = $(withText("Кошки"));


    public CatsCatalog openCats() {
        open(Data.baseURL);
        cats.click();
        return new CatsCatalog();
    }

}
