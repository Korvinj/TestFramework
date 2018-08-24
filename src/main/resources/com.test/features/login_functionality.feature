Feature: Base functionality login tests

  Scenario: Verify that user in not able to login with no text
    Given Open smava page
    When Try to login to account with empty credentials
    Then I check that login error message on the page: Bitte überprüfen Sie Ihre Eingabe.
    And I check that password error message on the page: Bitte überprüfen Sie Ihre Eingabe.

  Scenario: Verify that user in not able to login with incorrect parameters
    Given Open smava page
    When Try to login to account with username: test and password: test
    Then I check that only login error message on the page: Bitte überprüfen Sie Ihre Eingabe.

  Scenario: Verify that user will be redirected on the wrong logging page with correct parameters
    Given Open smava page
    When Try to login to account with username: test@test.com and password: test
    Then I check that user on the wrong login page