@regression
Feature: Login Page Test

  As a user I want to check login/logout functionality
  Background: I am on homepage

  @author_nikhil @sanity
  Scenario: User should navigate to login page successfully
    When I click on my account link
    And I select "Login" option from my account options
    Then I should navigate to login page successfully

  @author_nikhil @smoke
  Scenario: User should login and logout successfully
    When I click on my account link
    And I select "Login" option from my account options
    And I enter email "primetesting103@gmail.com"
    And I enter password "PrimeTesterNo1"
    And I click on login button
    Then I should login successfully
    And I click on my account link
    And I select "Logout" option from my account options
    Then I should logout successfully
    And I click on continue button