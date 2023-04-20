Feature: As an Admin User I should be able to Add-Edit-Delete Position Categories Under Human Resources Setup

  Background:
    Given Navigate to Campus
    And Enter username and password and click login button
    Then User should login succesfully
    When Click on the leftnav
      | humanResources     |
      | hRSetupArrow       |
      | positionCategories |

  Scenario: As an Admin User I should be able to Add Position Categories Under Human Resources Setup
    Then  Click on the element in Dialog
      | addButton |
    When Fill out the form
      | nameInput2 | Software Architect |
    Then Click on the element in Dialog
      | saveButton |
    And verify process

  Scenario: As an Admin User I should be able to Add Position Categories Under Human Resources Setup but Negative
    Then  Click on the element in Dialog
      | addButton |
    When Fill out the form
      | nameInput2 | Software Architect |
    Then Click on the element in Dialog
      | saveButton |
    And verify process but negative


  Scenario: As an Admin User I should be able to Edit Position Categories Under Human Resources Setup

    When Fill out the form
      | searchName | Software Architect |
    Then Click on the stale element in Dialog
      | searchButton |
      | editButton   |
    When Fill out the form
      | nameInput2 | Ninja Coder |
    Then Click on the element in Dialog
      | saveButton |
    And verify process


  Scenario:As an Admin User I should be able to Delete Position Categories Under Human Resources Setup
    When Fill out the form
      | searchName | Software Architect |
    Then Click on the stale element in Dialog
      | searchButton |
      | deleteButton |
    Then Click on the element in Dialog
      | deleteDialogBtn |
    And verify process


  Scenario: As an Admin User I should be able to Delete Position Categories Under Human Resources Setup but negative
    When Fill out the form
      | searchName | Software Architect |
    Then Click on the element in Dialog
      | searchButton |
    Then Verify that notification messages “There is no data to display”
