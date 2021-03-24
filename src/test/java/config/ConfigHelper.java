package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public static String getUsername(){
        return getAuthorizationConfig().myUsername();
    }

    public static String getPassword(){
        return getAuthorizationConfig().myPassword();
    }

    private static AuthorizationConfig getAuthorizationConfig(){
      return ConfigFactory.newInstance().create(AuthorizationConfig.class, System.getProperties());
    }
}
