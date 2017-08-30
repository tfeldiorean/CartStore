import com.gargoylesoftware.htmlunit.Page;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {
    protected static HomePage homePage;
    protected static CreateAccountPage createAccountPage;
    protected static LoginPage loginPage;
    protected static WebDriver webDriver;
    protected static ProductPage productPage;
    protected static AccountPage accountPage;
    protected static CartPage cartPage;
    protected static Database database;

    @BeforeClass
    public static void before(){
        System.setProperty("webdriver.chrome.driver","D:/ChromeDriver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://192.168.164.15/");
        createAccountPage = PageFactory.initElements(webDriver, CreateAccountPage.class);
        homePage=PageFactory.initElements(webDriver, HomePage.class);
        loginPage =PageFactory.initElements(webDriver,LoginPage.class);
        accountPage = PageFactory.initElements(webDriver,AccountPage.class);
        productPage = PageFactory.initElements(webDriver,ProductPage.class);
        cartPage = PageFactory.initElements(webDriver,CartPage.class);
    }

    @AfterClass
    public static void after(){
        //webDriver.close();
    }
}
