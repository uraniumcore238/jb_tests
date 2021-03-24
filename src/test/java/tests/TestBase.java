package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.NoSuchElementException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static helper.DriverHelper.configureDriver;

public class TestBase {

    @BeforeAll
    public static void beforeAll(){
        configureDriver();

    }

//    @BeforeEach
//    public void beforeEach(){
//
//        try{
//            $ (".jetbrains-cookies-banner__close-button").click();
//        }
//        catch(NoSuchElementException e){
//            System.out.println(e.getMessage());
//        }

//    }
}
