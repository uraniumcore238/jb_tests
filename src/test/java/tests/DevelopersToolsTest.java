package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ProductsIdePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

@Tag("web")
public class DevelopersToolsTest extends TestBase{

    @Test
    @DisplayName("Check developer's tools")
    void developerToolsTest() {

        MainPage mainPage = new MainPage();
        ProductsIdePage productsIdePage = new ProductsIdePage();

        open("");
        mainPage.closeTheCookieWindow();

        $x("//a[contains(text(), 'Choose your tool')]").click();

        productsIdePage.checkTheIde();

    }

}
