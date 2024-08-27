package pages;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.HoverOptions;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebElementsCondition;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.sql.DriverManager.getDriver;

public class OrderPage {
    private SelenideElement name = $(By.className("recipient-name"));
    private SelenideElement number = $(By.className("recipient-phone"));
    private SelenideElement next = $(withText("Далее"));
    private SelenideElement selectPickUpPointButton = $(By.className("open-pickup-retail-points-popup"));
    private SelenideElement pickUpPoint = $$(By.className("filial")).get(3);
    //private SelenideElement ymaps = $$(By.tagName("ymaps")).get(79);
    private SelenideElement selectCertainPickUpPoint = $(By.className("place__button"));

    private WebDriver driver;


    void createBrowser() {
        driver = new ChromeDriver();
    }

    public void fillName() {
        name.sendKeys("колян");
    }

    public void fillNumber() {
        number.sendKeys("1111111111");
    }

    public void next() {
        next.click();
    }

    public void selectPickUpPointButton() {
        selectPickUpPointButton.click();
    }

    public void pickUpPoint() {
        //pickUpPoint.doubleClick(ClickOptions.withTimeout(Duration.ofSeconds(15))); // не работает
        //pickUpPoint.isSelected(); // тож не работает
        //pickUpPoint.doubleClick(); // тож не работает
        //pickUpPoint.hover();
        pickUpPoint.click();
    }

    public void selectCertainPickUpPoint() {
        //selectCertainPickUpPoint.click(ClickOptions.withTimeout(Duration.ofSeconds(15))); //ну я хз как это сделать
        //selectCertainPickUpPoint.isEnabled(); //ну я хз как это сделать
        //selectCertainPickUpPoint.hover();
        //selectCertainPickUpPoint.shouldBe(visible).click();
        //driver.findElement(By.className("place__button")).click();
        //selectCertainPickUpPoint.toWebElement().click();
        selectCertainPickUpPoint.click();
    }

}

