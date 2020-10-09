package all_package.tests;

import all_package.base.AbstractTestBase;
import all_package.base.Environment;
import all_package.utilities.Driver;
import net.bytebuddy.asm.Advice;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.List;

public class SearchTest extends AbstractTestBase {

//    @DataProvider(name="testData")
//    public Object [][] testData(){
//        return new Object[][]{
//                {"https://www.google.com/"},
//                {"https://www.bing.com/"}
//        };
//
//    }



    @Test
    public void functionalTest() {
        System.out.println(testEnvironment.env1());
        Driver.getDriver().get(testEnvironment.env1());
        searchPage.search("java");
        Driver.getDriver().get(testEnvironment.env2());
        searchPage.search("cucumber");
        Driver.getDriver().get(testEnvironment.env3());
        searchPage.searchViaYahoo("selenium");
    }

    @Test
    public void googleTest(){
        Driver.getDriver().get(testEnvironment.env1());
        searchPage.search("java");
    }
    @Test
    public void bingTest(){
        Driver.getDriver().get(testEnvironment.env2());
        searchPage.search("selenium");
    }
    @Test
    public void yahooTest(){
        Driver.getDriver().get(testEnvironment.env3());
        searchPage.searchViaYahoo("page obejct model");
    }





}
