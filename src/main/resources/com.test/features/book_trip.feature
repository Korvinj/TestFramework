Feature: Base functionality to book a trip

  Scenario: Verify that user is able book a trip for 3 persons
    Given I open main page
    When I login with login: user@phptravels.com and password: demouser
    And I want to go to tour booking page
    And I search for tour type: Location to city: Dubai
    And I want to book a tour for: 3 Guests
    And I want to book a tour with type: Holidays
    And I search for the tours
    And I select 1 tour from search
    And I book a tour on the offer page
    And I fill personal data for guest number: 1
    And I fill personal data for guest number: 2
    And I fill personal data for guest number: 3
    And I book a trip with all personal data
