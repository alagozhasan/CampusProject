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
      And Select an element on Form
        | stage  | studentRegistration  |
      And Click on the element in Dialog
        | saveButton|




