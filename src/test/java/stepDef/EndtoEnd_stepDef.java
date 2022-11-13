package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.EndtoEnd_pageObj;

public class EndtoEnd_stepDef extends Config {

    EndtoEnd_pageObj EE = new EndtoEnd_pageObj(driver);

    @Given("I am BestBuy Homepage")
    public void iAmBestBuyHomepage() {
        EE.verifyhomepagetitle();
    }

    @And("I enter Maclaptop on searchbar")
    public void iEnterMaclaptopOnSearchbar() {
        EE.entermacLaptoponsearchbox();
    }

    @And("I click on search icon button")
    public void iClickOnSearchIconButton() {
        EE.entermacLaptoponsearchboxicon();
    }

    @And("I click on the first maclaptop link from the list")
    public void iClickOnTheFirstMaclaptopLinkFromTheList() {
        EE.clickonproductlink();
    }

    @And("I click on the add to cart button")
    public void iClickOnTheAddToCartButton() {
        EE.clickaddtocart();
    }

    @And("I click on go to cart from the popup window")
    public void iClickOnGoToCartFromThePopupWindow() {
        EE.clickongotocartlink();
    }

    @And("I click the on close icon to cancel the popup window")
    public void iClickTheOnCloseIconToCancelThePopupWindow() {
        EE.closePopupWindow();
    }

    @When("I click on the Checkout Button")
    public void iClickOnTheCheckoutButton() {
        EE.CheackoutButton();
    }

    @Then("I should click on continue as guest button")
    public void iShouldClickOnContinueAsGuestButton() {
    }
}
