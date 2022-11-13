package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EndtoEnd_pageObj extends Config {


    public EndtoEnd_pageObj(WebDriver driver){
        PageFactory.initElements(driver,this);
        Config.driver = driver;
    }

    // Locator
        @FindBy (how =How.ID, using = "gh-search-input")
        public WebElement searchboxLocator;

        @FindBy (how =How.XPATH, using = "//button[@type='submit']")
        public WebElement searchiconLocator;

        @FindBy (how =How.XPATH,using = "//a[@class='image-link']")
        public WebElement productLocator;

        @FindBy(how =How.XPATH, using = "//button[@data-button-state='ADD_TO_CART']")
        public WebElement addtocartLocator;

        @FindBy (how= How.LINK_TEXT, using = "Go to Cart")
        public WebElement gotocartLocator;

        @FindBy (how =How.XPATH, using = "/html/body/div[1]/main/div/div[2]/div[1]/div/div[4]/div[1]/div/div/div/div/button")
        public WebElement popupcloseLocator;



    //button[@aria-label='Close']
        @FindBy (how =How.XPATH, using = "//button[@data-track='Checkout - Top']")
        public WebElement CheckoutLocator;






  // Functions
        public void verifyhomepagetitle(){
            String exp = "Best Buy | Official Online Store | Shop Now & Save";
            String act = driver.getTitle();
            Assert.assertEquals(exp, act);
            System.out.println("i am At bestbuy home page");
        }

        public void entermacLaptoponsearchbox(){
            searchboxLocator.sendKeys("Maclaptop");
        }
        public void entermacLaptoponsearchboxicon(){
            searchiconLocator.click();
    }
        public void clickonproductlink(){
             productLocator .click();
    }

        public void clickaddtocart(){
            addtocartLocator .click();
        }
        public void clickongotocartlink() {
            gotocartLocator.click();
        }
        public void closePopupWindow() {
           popupcloseLocator.click();
        }

        public void CheackoutButton(){
                CheckoutLocator.click();
        }







}
