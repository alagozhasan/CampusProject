Feature: Add-Edit-Delete operations in the School Setup/Locations Page

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the leftnav
      | setup           |
      | parameters     |
      | gradeLevels |

  Scenario: Add a new Grade Level in the Grade Levels
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Mrv123 |
      | shortName  | Mrv    |
      | order   | 18     |
    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Add a Grade Level which is already added in the Grade Levels Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Mrv123 |
      | shortName  | Mrv    |
      | order   | 18     |
    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Verify the notification message that is already exist

  Scenario: Edit the added Grade Level in the Grade Levels Page
    When Search name and click on the edit button
    And Fill out the form
      | nameInput2 | Mrv1234 |
    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Delete the edited Grade Level in the Grade Levels Page
    When Search name and delete the Location
    Then Verify the notification message that is successfully

  Scenario: Delete the Grade Level which is already deleted in the Grade Levels Page
    Then Verify that the location is already deleted



