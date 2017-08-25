package util;

import org.apache.commons.exec.environment.EnvironmentUtils;

import java.util.Properties;

public class EnvironmentUtil {

    private static Properties props;

    static {

        try {
            String envFile = System.getProperty("env");
            String filePath = "environments/".concat(envFile.concat(".properties"));
            props = new Properties();
            props.load(EnvironmentUtils.class.getClassLoader().getResourceAsStream(filePath));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AutomationExceptions("Could not read property init file", e);
        }
    }

    public static int getAppPort() {
        return Integer.parseInt(props.getProperty("port"));
    }

    public static String getAppBaseUrl() {
        return props.getProperty("baseUrl");
    }
}
