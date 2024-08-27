package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Cart;
import pages.MainPage;

import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.sql.DriverManager.getDriver;


public class Selenide {

      @Test
    public void putItemInCart() {
        var CatsCatalog = new MainPage().openCats();
        var Cart = CatsCatalog.putItemInCart();
        var OrderPage = Cart.buy();
        OrderPage.fillName();
        OrderPage.fillNumber();
        OrderPage.next();
        OrderPage.selectPickUpPointButton();
        OrderPage.pickUpPoint();
        OrderPage.selectCertainPickUpPoint();

    }

}
