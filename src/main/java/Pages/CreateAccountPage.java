package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

    private WebDriver webDriver;
    public CreateAccountPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement telephoneField;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@id='input-confirm']")
    private WebElement confirmPassword;
    @FindBy(xpath = "//form/fieldset[3]/div/div/label[2]")
    private WebElement subscribeCheck;
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement readTerms;
    @FindBy(xpath = "//form/div/div/input[2]")
    private WebElement continueBtn;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']/i[@class]")
    private WebElement warningMsj;
    @FindBy(xpath = "//div[@id='content']/ul[1]/li[1]/a")
    private WebElement editInformation;
    @FindBy(xpath = "//input[@id='input-firstname'] [@value='test']")
    private WebElement firstNameVerify;
    @FindBy(xpath = "//div[@id=\"content\"]/div/div/a")
    private WebElement continueButton;
    @FindBy(xpath = "//li[@class='dropdown']//span[@class='caret']")
    private WebElement accountBtn;
    @FindBy(xpath = "//ul[@class]/li[@class]/ul/li[2]")
    private WebElement accountLoginBtn;

    public LoginPage accountCreate(String name, String lastName, String email, String telephone,
                                   String password, String confirmPass) throws InterruptedException {
        firstNameField.sendKeys(name);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        telephoneField.sendKeys(telephone);
        passwordField.sendKeys(password);
        confirmPassword.sendKeys(password);
        subscribeCheck.click();
        readTerms.click();
        continueBtn.click();
        Thread.sleep(1000);
        continueButton.click();
        editInformation.click();

        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        return loginPage;
    }

    public String myAcccountMessage() {
        return firstNameVerify.getAttribute("value");
    }
}





