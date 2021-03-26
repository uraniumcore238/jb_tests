package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
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
    @DisplayName("Console log should not have Errors")
    void ConsoleLogShouldNotHaveErrors() {

        open("");
        String consoleLogs = getConsoleLogs();
        assertThat(consoleLogs, not(containsString("WARNING")));
    }

}
