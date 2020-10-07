package all_package.tests;

import all_package.base.AbstractTestBase;
import all_package.utilities.Driver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.List;

public class SearchTest extends AbstractTestBase {

    @DataProvider(name="testData")
    public Object [][] testData(){
        return new Object[][]{
                {"https://www.google.com/"},
                {"https://www.bing.com/"}
        };

    }


    @Test(dataProvider = "testData")
    public void verifySearchTest(String url){
        Driver.getDriver().get(url);
        searchPage.search("Java");

        List<WebElement> allLink = Driver.getDriver().findElements(By.tagName("a"));
        Assert.assertTrue(allLink.get(0).isEnabled());
    }


}
