package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

@Tag("web")
public class CheckTheHeaderMenuTest extends TestBase {

    @Test
    @DisplayName("Page should have title \"Essential tools for software developers and teams\"")
    void checkTheHeaderMenu(){

        MainPage mainPage = new MainPage();

        step("Open main page", () -> open(""));

        step("Close the coocie pop-up", () -> mainPage.closeTheCookieWindow());

        step("Check the header menu", () -> {
            $x("//div[contains(text(),'Developer Tools')]").shouldHave(text("Developer Tools"));
            $x("//div[contains(text(),'Team Tools')]").shouldHave(text("Team Tools"));
            $x("//div[contains(text(),'Learning Tools')]").shouldHave(text("Learning Tools"));
            $x("//div[contains(text(),'Solutions')]").shouldHave(text("Solutions"));
            $x("//a[contains(text(),'Store')]").shouldHave(text("Store"));
        });

        step("Check the main banners", () -> {
            $x("//h3[contains(text(), 'Developer Tools')]").shouldHave(text("Developer Tools"));
            $x("//h3[contains(text(), 'Team Tools')]").shouldHave(text("Team Tools"));
            $x("//h3[contains(text(), 'Learning Tools')]").shouldHave(text("Learning Tools"));
            $x("//h3[contains(text(), 'Kotlin')]").shouldHave(text("Kotlin"));
        });
    }


}
