package pages;

import com.codeborne.selenide.SelenideElement;
import data.Data;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class CatsCatalog {
    private SelenideElement itemToCart = $$(By.className("to-basket-link")).get(0);
    private SelenideElement cart = $(By.className("basket-link__icon"));

    public Cart putItemInCart() {
        itemToCart.click();
        cart.click();

        return new Cart();
    }
}
