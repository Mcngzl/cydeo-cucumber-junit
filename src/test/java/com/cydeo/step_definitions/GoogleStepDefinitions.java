package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

   GoogleSearchPage googleSearchPage = new GoogleSearchPage();


    @When("user type apple and clicks enter")
    public void user_type_and_clicks_enter2() {
        googleSearchPage.searchbox.sendKeys("apple" + Keys.ENTER);
    }


    @When("user type {string} and clicks enter")
    public void user_type_and_clicks_enter(String searchKeyword) {
      googleSearchPage.searchbox.sendKeys(searchKeyword + Keys.ENTER);
    }


    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {

        String expectedTitle =string+" - Google Zoeken";
        String actualTitle = Driver.getDriver().getTitle();
    }


    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {

        String expectedTitle ="apple - Google Zoeken";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
        //Assert.assertTrue(actualTitle.equals(expectedTitle));
    }


    @When("user is on Google search page")
    public void user_is_on_googel_search_page() throws InterruptedException {
        Driver.getDriver().get("https://www.google.com");
        Thread.sleep(3000);
        googleSearchPage.allesAccepteren.click();
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle =Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);



    }


}
