import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    private WebDriver webDriver;
    public LoginPage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//li[@class='dropdown']//span[@class='caret']")
    private WebElement accountBtn;
    @FindBy(xpath = "//ul[@class]/li[@class]/ul/li[2]")
    private WebElement accountLoginBtn;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement loginEmail;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement loginPassword;
    @FindBy(xpath = "//div/div[2]/div/form/input[@class='btn btn-primary']")
    private WebElement loginBtn;
    @FindBy(xpath = "//div[@id='content']/h2[1]")
    private WebElement accountMessage;
    @FindBy(xpath = "//div[@id='top-links']/ul/li[2]/ul/li[5]/a")
    private WebElement logOut;
    @FindBy(xpath = "//div[@id='account-account']/ul/li[1]/a/i")
    private WebElement homePageBtn;

    public LoginPage logIn(String email, String password){
        accountBtn.click();
        accountLoginBtn.click();
        loginEmail.sendKeys(email);
        loginPassword.sendKeys(password);
        loginBtn.click();
        return this;
    }

    public String myAcccountMessage() {
        return accountMessage.getText();
    }

    public LoginPage logOutAccount(){
        accountBtn.click();
        logOut.click();

        return this;
    }
    public LoginPage clickHomePage(){
        homePageBtn.click();
        return this;
    }
}
