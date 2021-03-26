package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public static String getWebUrl(){
        return getWebConfig().webUrl();
    }

    public static String getUsername(){
        return getAuthorizationConfig().myUsername();
    }

    public static String getPassword(){
        return getAuthorizationConfig().myPassword();
    }

    public static String getWebRemoteDriver(){
        // https://%s:%s@selenoid.autotests.cloud/wd/hub/
        return String.format(System.getProperty("web.remote.driver"),
        getWebConfig().webRemoteDriverUser(), getWebConfig().webRemoteDriverPassword());
    }

    public static boolean isRemoteWebDriver() {
        return System.getProperty("web.remote.driver") != null;
    }

    public static String getWebRemoteDriverUser(){
        return getWebConfig().webRemoteDriverUser();
    }

    private static AuthorizationConfig getAuthorizationConfig(){
      return ConfigFactory.newInstance().create(AuthorizationConfig.class, System.getProperties());
    }

    private static WebConfig getWebConfig(){
        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }
}
