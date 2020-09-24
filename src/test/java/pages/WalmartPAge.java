package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WalmartPAge {

    public WalmartPAge(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "global-search-input")
    public WebElement walmartSearchBox;

    @FindBy(className = "result-summary-container")
    public WebElement walmartSonucSayisi;

}
