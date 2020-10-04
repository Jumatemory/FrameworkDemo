package all_package.tests;

import all_package.base.AbstractTestBase;
import all_package.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends AbstractTestBase {

    @Test
    public void verifySearchTest(){
        searchPage.search("Java");
        List<WebElement> allLink = Driver.getDriver().findElements(By.tagName("a"));
        Assert.assertTrue(allLink.get(0).isEnabled());
    }


}
