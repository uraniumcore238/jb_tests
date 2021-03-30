package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ProductsIdePage {

    public void checkTheIde(){

        step("Main banner should have text-\"Find the right tool\"", () ->
            $("h1").shouldHave(text("Find the right tool")));
        step("Idea banner should have a text -\"IntelliJ IDEA\"", () ->
            $("a[href='/idea/']").shouldHave(text("IntelliJ IDEA")));
        step("PyCharm banner should have a text -\"PyCharm\"", () ->
            $("a[href='/pycharm/']").shouldHave(text("PyCharm")));
        step("WebStorm banner should have a text -\"WebStorm\"", () ->
            $("a[href='/webstorm/']").shouldHave(text("WebStorm")));
        step("PhpStorm banner should have a text -\"PhpStorm\"", () ->
            $("a[href='/phpstorm/']").shouldHave(text("PhpStorm")));
        step("Rider banner should have a text -\"Rider\"", () ->
            $("a[href='/rider/']").shouldHave(text("Rider")));
        step("CLion banner should have a text -\"CLion\"", () ->
            $("a[href='/clion/']").shouldHave(text("CLion")));
        step("Datalore banner should have a text -\"Datalore\"", () ->
            $("a[href='https://datalore.jetbrains.com/']").shouldHave(text("Datalore")));
        step("DataGrip banner should have a text -\"DataGrip\"", () ->
            $("a[href='/datagrip/']").shouldHave(text("DataGrip")));
        step("RubyMine banner should have a text -\"RubyMine\"", () ->
            $("a[href='/ruby/']").shouldHave(text("RubyMine")));

    }
}
