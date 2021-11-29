package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ProductCartPage {

    //define and locate web element
    @FindBy(xpath = "//*[@id='quantity']")
    private WebElement quantity;
    @FindBy(css = "span[title=\"Ruby on Rails Tote\"]")
    private WebElement clickOnProductName;
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCart;

    public ProductCartPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,5), this);
    }

    public void addQuantityNAddToCart() {
        //try using xpath,
        quantity.clear();
        //update quantity
        quantity.sendKeys("3");
        //Add to cart
        addToCart.click();
    }
}
