package pages;

import java.util.NoSuchElementException;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public void closeTheCookieWindow(){

        try{
            $ (".jetbrains-cookies-banner__close-button").click();
        }
        catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }

    }




}
