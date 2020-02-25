@scenario
Feature: Car rental without "Name".

  Scenario Outline: Should open browser
    Given Navigate to "http://qalab.pl.tivixlabs.com/" using "<browser>"
    When Filling out the application form.
    And Choice of car model
    And Click Rent! button
    And Completing the form without the Name field
    Then After clicking Rent, a warning appears regarding the blank Name field

    Examples:
      |browser|
      |CHROME |