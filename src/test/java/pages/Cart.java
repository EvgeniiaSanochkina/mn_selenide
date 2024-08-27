package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class Cart {
    private SelenideElement buyButton = $(withText("Оформить заказ"));
    public OrderPage buy() {
        buyButton.click();
        return new OrderPage();
    }
}
