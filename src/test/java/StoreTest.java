import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import java.sql.SQLException;

public class StoreTest extends TestBase {

//Create Account(Already Created)
    @Test
    public void accountCreateTest() throws InterruptedException {
        homePage.clickAccountCreate();
        createAccountPage.accountCreate("test", "traian", "entest2@yahoo.com", "0723959818", "traian", "traian");
        Assert.assertEquals(createAccountPage.myAcccountMessage(),"test");
        loginPage.logOutAccount();
    }
//Try to login
    @Test
    public void loginTest() {
        loginPage.logIn("entest2@yahoo.com", "traian");
        Assert.assertEquals(loginPage.myAcccountMessage(), "My Account");
        loginPage.logOutAccount();
    }
//Adding entry in database and verify the result
    @Test
    public void addressBookTest() throws SQLException{
        database = PageFactory.initElements(webDriver, Database.class);
        database.createAddress();
        loginPage.logIn("entest2@yahoo.com","traian");
        accountPage.addressBook();
        Assert.assertEquals(accountPage.addressCheck(), "test traian\n" +
                "Endava\n" +
                "Calea Vitan\n" +
                "Iuliu Maniu\n" +
                "Bucuresti 306991\n" +
                "Bucuresti\n" +
                "Romania");
    }
    //Add product to cart and increase quantity in database and verify the change in application
    @Test
    public void productSelection() throws SQLException, InterruptedException {
        loginPage.logIn("entest2@yahoo.com","traian");
        loginPage.clickHomePage();
        productPage.productSelect("17");
        database = PageFactory.initElements(webDriver, Database.class);
        database.changeQuantity();
        Thread.sleep(1000);
        cartPage.cartView();
        Assert.assertEquals("18",cartPage.quantityCheck());
    }
}
