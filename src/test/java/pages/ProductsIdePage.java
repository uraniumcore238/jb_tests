package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProductsIdePage {

    public void checkTheIde(){

        $("h1").shouldHave(text("Find the right tool"));
        $("a[href='/idea/']").shouldHave(text("IntelliJ IDEA"));
        $("a[href='/pycharm/']").shouldHave(text("PyCharm"));
        $("a[href='/webstorm/']").shouldHave(text("WebStorm"));
        $("a[href='/phpstorm/']").shouldHave(text("PhpStorm"));
        $("a[href='/rider/']").shouldHave(text("Rider"));
        $("a[href='/clion/']").shouldHave(text("CLion"));
        $("a[href='https://datalore.jetbrains.com/']").shouldHave(text("Datalore"));
        $("a[href='/datagrip/']").shouldHave(text("DataGrip"));
        $("a[href='/ruby/']").shouldHave(text("RubyMine"));

    }
}
