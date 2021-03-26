package tests;


import config.ConfigHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import java.util.NoSuchElementException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("web")
public class LoginWithCorrectDataTest extends TestBase {


    @Test
    @DisplayName("Check login with correct data")
    void correctDataLoginTest() {

        MainPage mainPage = new MainPage();

        open("");

        mainPage.closeTheCookieWindow();


        $("a[data-test='menu-main-icon-account']").click();
        $("h1").shouldHave(text("Welcome to JetBrains Account"));
        $("#username").setValue(ConfigHelper.getUsername());
        $("input[name='password']").setValue(ConfigHelper.getPassword());
        $("div[class=pull-left]").click();
        $("div[class='list-group']").shouldHave(text("MyName MyLastName"));


    }


}
