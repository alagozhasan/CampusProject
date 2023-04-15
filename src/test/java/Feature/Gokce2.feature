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