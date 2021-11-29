package org.example;

import static org.junit.Assert.assertTrue;


import PageFactory.CategoryPage;
import PageFactory.CheckOutPage;
import PageFactory.LoginPage;
import PageFactory.ProductCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


    public class AppTest {

        WebDriver driver;

        @BeforeMethod
        public void testdrivermethod() {
            System.setProperty("webdriver.chrome.driver", "/Users/nehasharma/IdeaProjects/Pages/src/main/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://spree-vapasi-prod.herokuapp.com/login");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Test
        public void test() throws InterruptedException {

            LoginPage loginpage = new LoginPage(driver);
            loginpage.login("neha@gmail.com","neha123");


             CategoryPage categoryPage = new CategoryPage(driver);
             categoryPage.searchNSelectInCategory();
             categoryPage.selectFromProducList();
            // categoryPage.selectCategoryFromDropDown();

            ProductCartPage productcartpage=new ProductCartPage(driver);
            productcartpage.addQuantityNAddToCart();

            CheckOutPage checkoutpage=new CheckOutPage(driver);
            checkoutpage.checkOut();

            //4. From product details, Add to Cart
           /* ProductDetailPage productsPage = new ProductDetailPage(driver);
            productsPage.selectItems();

            //5. Assertion on Cart Page
            CartPage cartPage = new CartPage(driver);
            cartPage.cartTotal();
            //  Assert.assertEquals(cartPage.cartTotal(), "$63.96");
            cartPage.cartSubmit();

            //6. Checkout Address Page
            CheckoutAddressPage checkoutAddressPage = new CheckoutAddressPage(driver);
            checkoutAddressPage.addBillingAddress("Test", "One", "23, B9", "home", "Delhi", "985728");
            checkoutAddressPage.saveAddr();

            //7. Assertion on Checkout Delivery Page
            CheckoutDeliveryPage checkoutDeliveryPage = new CheckoutDeliveryPage(driver);
            Assert.assertEquals(checkoutDeliveryPage.deliveryPageReview(), "Delivery");
            checkoutDeliveryPage.deliveryPage();

            //8. Checkout Payment Page
            CheckoutPaymentPage checkoutPaymentPage = new CheckoutPaymentPage(driver);
            Assert.assertEquals(checkoutPaymentPage.paymentPage(), "Payment Information");
            checkoutPaymentPage.selectPaymentMode();
            System.out.println("Payment Page");

            //9. Order Confirmation Page
            OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
            Assert.assertEquals(orderConfirmationPage.orderConfirm(), "Your order has been processed successfully");
            orderConfirmationPage.orderConfirm();
            orderConfirmationPage.logout();
            System.out.println("Confirmation Page");

            //10. Logout
            LogoutPage logoutPage = new LogoutPage(driver);
            Assert.assertEquals(logoutPage.logout(), "Signed out successfully.");
            logoutPage.logout();


        }*/
        }
        @AfterMethod
        public void tearDown()
        {
          driver.close();
        }
    }


