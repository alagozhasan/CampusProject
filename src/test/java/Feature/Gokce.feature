Feature:

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    When Admin click Education-Setup-Subject Categories

  Scenario:Add functionality on Subject Categories

    When Admin click on the Add Subject Category
    And Admin add name and code
    And Admin click save button
    Then Admin will see success message

  Scenario:  Add functionality on Subject Categories Negative

    When Admin click on the Add Subject Category
    And Admin add name and code
    And Admin click save button
    Then Admin will see unsuccessfull message

  Scenario: Edit functionality on Subject Categories

    When Admin write Subject name on the name text box to search
    And Admin click search button
    And Admin click edit button
    And Admin change name and code
    And Admin click save button
    Then Admin will see success message

  Scenario: Delete functionality on Subject Categories

    When Admin write new Subject name on the name text box to search
    And Admin click search button
    And Admin click delete button
    When Admin will see delete confirmation dialog box and click delete button
    Then Admin will see success message

  Scenario: Delete functionality on Subject Categories Negative

    When Admin write new Subject name on the name text box to search
    And Admin click search button
    Then Admin will see no data message