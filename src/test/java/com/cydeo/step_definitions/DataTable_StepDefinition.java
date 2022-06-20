package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DataTable_StepDefinition {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    DropdownsPages dropdownsPages= new DropdownsPages();
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        //this method will return us list of string of given dropdown s options
        List<String> actualMonths = BrowserUtils.dropdownOptionsAsString(dropdownsPages.monthDropdown);

        Assert.assertEquals(expectedMonths,actualMonths);
        //Assert will check the size of the list first.if it is matching it will check content 1 by 1
    }



}
