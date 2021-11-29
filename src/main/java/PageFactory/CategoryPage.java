package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class CategoryPage {
    //define and locate web element
    @FindBy(css = "a[href=\"/t/bags\"]")
    private WebElement selectCategoryFromSide;
    @FindBy(css = "span[title=\"Ruby on Rails Tote\"]")
    private WebElement clickOnProductName;


    public CategoryPage(WebDriver driver){


        //will wait till all elements are found
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,5), this);
    }

    public void searchNSelectInCategory(){
        //search in category and select first option from side menu
        selectCategoryFromSide.click();
    }
    public void selectFromProducList(){
        //select from category
        clickOnProductName.click();
    }

}
