package helper;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.ConfigHelper;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.openqa.selenium.logging.LogType.BROWSER;

public class DriverHelper {

    public static void configureDriver(){

        Configuration.baseUrl = ConfigHelper.getWebUrl();
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;


        if (ConfigHelper.isRemoteWebDriver()) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
            Configuration.remote = ConfigHelper.getWebRemoteDriver();
        }




    }



    public static String getConsoleLogs() {
        return String.join("\n", Selenide.getWebDriverLogs(BROWSER));
    }
}
