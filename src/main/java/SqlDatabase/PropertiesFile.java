package SqlDatabase;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesFile {
    private WebDriver webDriver;

    public PropertiesFile(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static Properties properties = new Properties();

    static {
        String envFile = System.getProperty("env");
        InputStream input = PropertiesFile.class.getClassLoader().getResourceAsStream("env/local.properties");
        try {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getDriver() throws IOException {
        return properties.getProperty("jdbc.driver");
    }

    public static String getBaseUrl() throws IOException {
        return properties.getProperty("baseUrl");
    }

    public static Integer getPort() throws IOException {
        return Integer.parseInt(properties.getProperty("port"));
    }

    public static String getBasePath() throws IOException {
        return properties.getProperty("basePath");
    }

    public static String getSqlUser() throws IOException {
        return properties.getProperty("sql.user");
    }

    public static String getSqlPassword() throws IOException {
        return properties.getProperty("sql.password");
    }

}




