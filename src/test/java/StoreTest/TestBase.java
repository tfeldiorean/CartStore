package StoreTest;

import Pages.*;
import SqlDatabase.DataBase;
import SqlDatabase.PropertiesFile;
import org.junit.After;
import org.junit.Before;
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
    protected static DataBase dataBase;
    protected static PropertiesFile propertiesFile;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver","D:/ChromeDriver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://192.168.164.15/");
        createAccountPage = PageFactory.initElements(webDriver, CreateAccountPage.class);
        homePage=PageFactory.initElements(webDriver, HomePage.class);
        loginPage =PageFactory.initElements(webDriver, LoginPage.class);
        accountPage = PageFactory.initElements(webDriver, AccountPage.class);
        productPage = PageFactory.initElements(webDriver, ProductPage.class);
        cartPage = PageFactory.initElements(webDriver, CartPage.class);
        dataBase = PageFactory.initElements(webDriver,DataBase.class);

    }

    @After
    public void after(){
        //webDriver.close();
    }
}
