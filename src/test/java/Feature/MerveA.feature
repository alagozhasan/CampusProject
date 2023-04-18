Feature: Add-Edit-Delete operations in the Document Types Page

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    When User should login succesfully
    And Click on the leftnav
      | setup      |
      | parameters |
      | documentTypes |
    Scenario: Add a new  Document Types in the Document Page
      When Click on the element in Dialog
        | addButton |
      And Fill out the form
        | documentNameInput| Merve |
      And Select an element on Form Document Types
        | stage  | studentRegistration  |
      And Click on the element in Dialog
        | saveButton|
      And verify process

  Scenario: Add a new  Document Types in the Document Page but negative
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | documentNameInput| Merve |
    And Select an element on Form Document Types
      | stage  | studentRegistration  |
    And Click on the element in Dialog
      | saveButton|
    And verify process but negative

    Scenario: Admin User should  be able to edit same data Document Types
      When Fill out the form
      | nameSearch |  Merve |
      And Click on the element in Dialog
      | searchButton |
      | editButton |
      And Fill out the form
        | documentNameInput| MerveA |
      And Select an element on Form Document Types
        | stage  | examination  |
      And Click on the element in Dialog
        | saveButton|
      And verify process


      Scenario: Admin User should  be able to delete same data Document Types
        When Fill out the form
          | nameSearch |  MerveA |
        And Click on the element in Dialog
          | searchButton |
          | deleteButton |
          | deleteConfirmButton |
        And verify process


        Scenario: Admin User should not  be able to delete same data Document Types
          When Send key in Dialog
            | nameSearch | MerveA |
          And Click on the element in Dialog
            | searchButton |
          Then Verify that notification messages “There is no data to display”











