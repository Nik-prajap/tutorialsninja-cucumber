@regression
Feature: Top Menu test of Homepage

  As a user I want to check top menu tab options on Homepage

  Background: I am on homepage

  @author_nikhil @sanity
  Scenario: User should navigate to desktop page successfully
    When I mouse hover and click on desktop tab
    And I select menu "Show All Desktops"
    Then I should navigate to desktop page successfully

  @author_nicks @smoke @sanity
  Scenario: User should navigate to laptop and notebook page successfully
    When I mouse hover and click on laptop and notebook tab
    And I select menu "Show All Laptops & Notebooks"
    Then I should navigate to laptop and notebook page successfully

  @author_nicks @smoke
  Scenario: User should navigate to component page successfully
    When I mouse hover and click on component tab
    And I select menu "Show All Components"
    Then I should navigate to component page successfully