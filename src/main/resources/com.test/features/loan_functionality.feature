Feature: Base functionality loan tests

  Scenario Outline: Verify that user is able to open loan page with specific parameters
    Given Open smava page
    When Select loan type <loan_type>
    And Select loan amount <loan_amount> €
    And Select loan time <loan_time>
    And Press get loan button
    Then I check that all elements present on loan page
    Examples:
    | loan_type  | loan_amount | loan_time |
    | Wohnen     | 2.750       | 24 Monate |
    | Gewerbe    | 10.250      | 36 Monate |
    | Umschuldung| 120.000     | 60 Monate |
