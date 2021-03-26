package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

@Tag("web")
public class CheckTheHeaderMenuTest extends TestBase {

    @Test
    @DisplayName("Page should have title \"Essential tools for software developers and teams\"")
    void checkTheHeaderMenu(){

        MainPage mainPage = new MainPage();

        open("");

        mainPage.closeTheCookieWindow();

        $x("//div[contains(text(),'Developer Tools')]").shouldHave(text("Developer Tools"));
        $x("//div[contains(text(),'Team Tools')]").shouldHave(text("Team Tools"));
        $x("//div[contains(text(),'Learning Tools')]").shouldHave(text("Learning Tools"));
        $x("//div[contains(text(),'Solutions')]").shouldHave(text("Solutions"));
        $x("//div[contains(text(),'Store')]").shouldHave(text("Store"));
        $x("//h3[contains(text(), 'Developer Tools')]").shouldHave(text("Developer Tools"));
        $x("//h3[contains(text(), 'Team Tools')]").shouldHave(text("Team Tools"));
        $x("//h3[contains(text(), 'Learning Tools')]").shouldHave(text("Learning Tools"));
        $x("//h3[contains(text(), 'Kotlin')]").shouldHave(text("Kotlin"));

    }


}
