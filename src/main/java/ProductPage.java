import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    private WebDriver webDriver;
    public ProductPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@id='content']/div[2]/div[4]/div/div[1]/a/img")
    private WebElement selectProduct;
    @FindBy(xpath = "//select[@id='input-option226']")
    private WebElement colourSelect;
    @FindBy(xpath = "//input[@id='input-quantity']")
    private WebElement quantitySelect;
    @FindBy(xpath = "//button[@id='button-cart']")
    private WebElement addToCartButton;

    public ProductPage productSelect(String value) {
        selectProduct.click();
        colourSelect.click();
        Select select = new Select(webDriver.findElement(By.xpath("//select[@id='input-option226']")));
        select.selectByValue("15");
        quantitySelect.clear();
        quantitySelect.sendKeys(value);
        addToCartButton.click();

        return this;
    }
}








