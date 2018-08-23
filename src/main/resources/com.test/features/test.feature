Feature: Base functionality tests

  Scenario: Verify that user is able to open loan page with specific parameters
    Given Open smava page
    When Select loan type Wohnen
    And Select loan amount 2.750 €
    And Select loan time 24 Monate
    And Press get loan button
    Then I check that all elements present on loan page

  Scenario: Verify that user in not able to login with incorrect parameters
    Given Open smava page
    When Try to login to account with username: test and password: test
    Then I check that error message on the page: Bitte überprüfen Sie Ihre Eingabe.