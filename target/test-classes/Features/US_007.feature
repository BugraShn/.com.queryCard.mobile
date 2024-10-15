@US_007
Feature: As a user, I would like to be able to register on the site to take advantage of its functions

  Background: User opens the app

    * User makes driver adjustments
    * User confirms to be on the homepage

  @TC0701
  Scenario: Profile should be visible on the home page

    * Verifies profile button
    * Clicks the profile button
    * On the page that opens, confirm the text Sign In To See Your Info

  @TC0702 # Dogru bilgilerle uyelik olusturma
  Scenario: Sign up with correct information

    * Clicks the profile button
    * Sign Up the profile button
    * Enter "asdasada" , "979865987" , "M.1232568" into the form
    * The sign in page is verified.

  @TC0703 # Yanlıs bilgilerle uyelik olusturma denemesi
  Scenario: Sign up with fake information

    * Clicks the profile button
    * Sign Up the profile button
    * Enter fake "asdasada" , "97986" , "M.12" into the form

  @TC0704
  Scenario: Sign up with fake mail information

    * Clicks the profile button
    * Sign Up the profile button
    * Clicks the "*Use Email Instead" button
    * Enter "asdasada" , "asdd@gmail" , "M.1232568" into the form
    * Sign Up the profile button



