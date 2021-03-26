package tests;

import org.junit.jupiter.api.BeforeAll;
import static helper.DriverHelper.configureDriver;

public class TestBase {

    @BeforeAll
    public static void beforeAll(){
        configureDriver();

    }

}
