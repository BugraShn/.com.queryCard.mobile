@US_05
Feature: As a user, I want to be able to see the popular brands of the site on the homepage

  Background: User opens the app

    Given User makes driver adjustments

  @TC_0501
  Scenario: Popular Brands Display Test

    When Scrolls down the page until Popular Brands
    Then Verifies that popular brands are displayed
    And Driver turns off

