package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.RegisterPage;
import com.tutorialsninja.demo.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterPageSteps {
    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals("Register Account", new RegisterPage().getRegisterText());
    }

    @And("^I filled all mandatory field of registration$")
    public void iFilledAllMandatoryFieldOfRegistration() {
        new RegisterPage().enterFirstName("Nandini");
        new RegisterPage().enterLastName("Prajapati");
        new RegisterPage().enterEmail("PRIMETESTING" + new Utility().getRandomString(4) + "@gmail.com");
        new RegisterPage().enterTelephone("07999999991");
        new RegisterPage().enterPassword("PrimeTesting123");
        new RegisterPage().enterConfirmPassword("PrimeTesting123");
        new RegisterPage().clickOnSubscribeRadioButton("Yes");
        new RegisterPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("^I click on continue button of registration page$")
    public void iClickOnContinueButtonOfRegistrationPage() throws InterruptedException {
        Thread.sleep(500);
        new RegisterPage().clickOnContinueButton();
    }

    @Then("^I should see account successfully created message$")
    public void iShouldSeeAccountSuccessfullyCreatedMessage() {
        Assert.assertEquals("Your Account Has Been Created!", new RegisterPage().getAccountCreatedMessage());
    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new RegisterPage().clickOnContinue();
    }
}
