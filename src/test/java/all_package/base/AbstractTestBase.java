package all_package.base;

import all_package.pages.SearchPage;
import all_package.utilities.BrowserUtilities;
import all_package.utilities.ConfigurationReader;
import all_package.utilities.Driver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTestBase {

    protected Actions actions ;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected SearchPage searchPage;
    protected Environment testEnvironment;
    @BeforeTest
    public void beforeTest() {
        testEnvironment = ConfigFactory.create(Environment.class);
    }





    @BeforeMethod()
    public void setUpMethod(@Optional String url) {


        BrowserUtilities.waitForPageToLoad(10);
        Driver.getDriver().manage().window().maximize();
       Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions = new Actions(Driver.getDriver());
        searchPage = new SearchPage();


    }

    @AfterMethod
    public void teardown() throws IOException {

        BrowserUtilities.wait(3);
        Driver.closeDriver();
    }
}
