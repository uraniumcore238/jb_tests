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
public class LoginWithIncorrectDataTest extends TestBase {


    @Test
    @DisplayName("Check login with incorrect data")
    void incorrectDataLoginTest() {

        MainPage mainPage = new MainPage();

        open("");

        mainPage.closeTheCookieWindow();


        $("a[data-test='menu-main-icon-account']").click();
        $("h1").shouldHave(text("Welcome to JetBrains Account"));
        $("#username").setValue(ConfigHelper.getUsername());
        $("input[name='password']").sendKeys("123456789");
        $("div[class=pull-left]").click();
        $("p[class='js-auth-dialog-div-errors text-danger']").shouldHave(text("Incorrect username and/or password"));


    }




}
