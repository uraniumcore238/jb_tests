package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

@Tag("web")
public class DevelopersToolsTest extends TestBase{

    @Test
    @DisplayName("Check developer's tools")
    void developerToolsTest() {

        MainPage mainPage = new MainPage();

        open("");
        mainPage.closeTheCookieWindow();

        $x("//a[contains(text(), 'Choose your tool')]").click();
        $("h1").shouldHave(text("Find the right tool"));
        $("a[href='/idea/']").shouldHave(text("IntelliJ IDEA"));
        $("a[href='/pycharm/']").shouldHave(text("PyCharm"));
        $("a[href='/webstorm/']").shouldHave(text("WebStorm"));
        $("a[href='/phpstorm/']").shouldHave(text("PhpStorm"));
        $("a[href='/rider/']").shouldHave(text("Rider"));
        $("a[href='/clion/']").shouldHave(text("CLion"));
        $("a[href='/datalore/']").shouldHave(text("Datalore"));
        $("a[href='/datagrip/']").shouldHave(text("DataGrip"));

    }

}
