Feature: Add-Edit-Delete operations in the Fields Page

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the leftnav
      | setup      |
      | parameters |
      | fields     |

  Scenario: Add a new Fields in the Fields Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Field_Dnz |
      | codeInput | 167533     |
    And Select an element on Form
      | fieldType  | optionLogical  |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Add field which is already added in the Fields Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Field_Dnz |
      | codeInput | 167533     |
    And Select an element on Form
      | fieldType  | optionLogical  |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is already exist

  Scenario: Edit the added field in the Fields Page
    When Send key in Dialog
      | searchName | Field_Dnz |
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | editButton |
    And Fill out the form
      | nameInput2 | Field_Dnz_Edit |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Delete the added field in the Fields Page
    When Send key in Dialog
      | searchName | Field_Dnz_Edit |
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | deleteButton |
    And Click on the element in Dialog
      | deleteConfirmButton |
    Then Verify the notification message that is successfully

  Scenario: Give up deleting the field by clicking Cancel on Fields Page
    When Send key in Dialog
      | searchName | Jhon Wick|
    And Click on the element in Dialog
      | searchButton |
    And Click on the stale element in Dialog
      | deleteButton |
    And Click on the element in Dialog
      | cancelButton |
    Then Verify that the searched item still on the list