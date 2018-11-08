Feature: Base functionality to book a trip

  Scenario: Verify that user is able book a trip for 3 persons
    Given I open main page
    When I login with login: user@phptravels.com and password: demouser
    And I want to go to tour booking page
    And I search for tour type: Location to city: Dubai
    And I want to book a tour for: 3 Guests
    And I want to book a tour with type: Holidays
    And I search for the tours
