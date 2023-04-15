Feature:

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    When Admin click Setup-Parameters-Bank Account

  Scenario: Add functionality on Bank Account

    When Admin click on the Add Bank Account
    And Admin add name, iban, currency and integration code
    And Admin click save button
    Then Admin will see success message

  Scenario: Add functionality on Bank Account Negative

    When Admin click on the Add Bank Account
    And Admin add name, iban, currency and integration code
    And Admin click save button
    Then Admin will see unsuccessfull message

  Scenario: Edit functionality on Bank Account

    When Admin write Bank name on the name text box to search
    And Admin click search button
    And Admin click edit button
    And Admin change name, iban, currency and integration code
    And Admin click save button
    Then Admin will see success message

  Scenario: Delete functionality on Bank Account

    When Admin write new Bank name on the name text box to search
    And Admin click search button
    And Admin click delete button
    When Admin will see delete confirmation dialog box and click delete button
    Then Admin will see success message

  Scenario: Delete functionality on Bank Account Negative

    When Admin write new Bank name on the name text box to search
    And Admin click search button
    Then Admin will see no data message
