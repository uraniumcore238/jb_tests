package tests;

import config.ConfigHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static helper.DriverHelper.getConsoleLogs;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;



@Tag("web")
public class MainPageTests extends TestBase {

    @Test
    @DisplayName("Page should have title \"Essential tools for software developers and teams\"")
    void titlePageTest(){

        open("");

        $("h1").shouldHave(text("Essential tools for software developers and teams"));

    }

    @Test
    @DisplayName("Page should have title \"Essential tools for software developers and teams\"")
    void checkTheHeaderMenu(){

        open("");

        try{
            $ (".jetbrains-cookies-banner__close-button").click();

        }
        catch(NoSuchElementException e){
            System.out.println(e.getMessage());

        }



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

    @Test
    @DisplayName("Check login with correct data")
    void correctDataLoginTest() {

        open("");

        try {
            $(".jetbrains-cookies-banner__close-button").click();

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());

        }

        $("a[data-test='menu-main-icon-account']").click();
        $("h1").shouldHave(text("Welcome to JetBrains Account"));
        $("#username").setValue(ConfigHelper.getUsername());
        $("input[name='password']").setValue(ConfigHelper.getPassword());
        $("div[class=pull-left]").click();
        $("div[class='list-group']").shouldHave(text("MyName MyLastName"));


    }

    @Test
    @DisplayName("Check login with incorrect data")
    void incorrectDataLoginTest() {

        open("");

        try {
            $(".jetbrains-cookies-banner__close-button").click();

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());

        }

        $("a[data-test='menu-main-icon-account']").click();
        $("h1").shouldHave(text("Welcome to JetBrains Account"));
        $("#username").sendKeys("davinchi2@yandex.ru");
        $("input[name='password']").sendKeys("flotocaras1");
        $("div[class=pull-left]").click();
        $("p[class='js-auth-dialog-div-errors text-danger']").shouldHave(text("Incorrect username and/or password"));

    }


    @Test
    @DisplayName("Check login with incorrect data")
    void developerToolsTest() {

        open("");

        try {
            $(".jetbrains-cookies-banner__close-button").click();

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());

        }

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

    @Test
    @DisplayName("Console log should not have Errors")
    void ConsoleLogShouldNotHaveErrors() {

        open("");
        String consoleLogs = getConsoleLogs();
        assertThat(consoleLogs, not(containsString("WARNING")));

    }


}
