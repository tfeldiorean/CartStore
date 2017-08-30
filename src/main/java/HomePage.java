import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

        private WebDriver webDriver;

        public HomePage (WebDriver webDriver) {
            this.webDriver = webDriver;
        }

        @FindBy(xpath = ".//li[@class='dropdown']//span[@class='caret']")
        private WebElement accountBtn;
        @FindBy(xpath = "//ul[@class]/li[@class]/ul/li[1]")
        private WebElement registerBtn;

        public CreateAccountPage clickAccountCreate() throws InterruptedException {
            accountBtn.click();
            Thread.sleep(1000);
            registerBtn.click();

            CreateAccountPage createAccountPage = PageFactory.initElements(webDriver, CreateAccountPage.class);
            return createAccountPage;

    }
}
