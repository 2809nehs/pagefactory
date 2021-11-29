package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CheckOutPage {
    //define and locate web element
    @FindBy(id = "checkout-link")
    private WebElement checkout;

    public CheckOutPage(WebDriver driver)
    {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,5), this);
    }

    public void checkOut() {
        //click on checkout
        checkout.click();

    }

}
