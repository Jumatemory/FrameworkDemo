package all_package.pages;

import all_package.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "q")
    private WebElement searchField;
    @FindBy(name = "btnK")
    private WebElement searchBtn;
    @FindBy(name = "p")
    private WebElement yahooSrcField;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement yahooSrcBtn;

    public void search(String term){
        searchField.sendKeys(term, Keys.ENTER);


    }
    public void searchViaYahoo(String text){
        yahooSrcField.sendKeys(text);
        yahooSrcBtn.click();
    }


}
