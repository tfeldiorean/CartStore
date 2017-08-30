import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    private WebDriver webDriver;
    public CartPage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@id='cart']")
    private WebElement cartBtn;
    @FindBy(xpath = "//div[@id='cart']/ul/li[2]/div/p/a[1]/strong")
    private WebElement viewCartBtn;
    @FindBy(xpath = "//div[@id='content']/form/div/table/tbody/tr/td[4]/div/input")
    private WebElement quantityField;

    public CartPage cartView() throws InterruptedException {
        cartBtn.click();
        Thread.sleep(1000);
        viewCartBtn.click();
        return this;
    }
    public String quantityCheck() {
        return quantityField.getAttribute("value");
    }

}
