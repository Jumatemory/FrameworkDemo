package all_package.pages;

import all_package.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "q")
    private WebElement searchField;
    @FindBy(name = "btnK")
    private WebElement searchBtn;

    public void search(String term){
        searchField.sendKeys(term);
        searchBtn.click();

    }


}
