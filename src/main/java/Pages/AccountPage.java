package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {
    private WebDriver webDriver;
    public AccountPage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@class='list-group']/a[4]")
    private WebElement addressBookBTN;
    @FindBy(xpath = "//div[@id='content']/div[1]/table/tbody/tr/td[1]")
    private WebElement address;

    public AccountPage addressBook(){
        addressBookBTN.click();
        return this;
    }
    public String addressCheck() {

        return address.getText();
    }
}
