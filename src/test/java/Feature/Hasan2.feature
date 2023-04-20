Feature: As an Admin User I should be able to Add-Edit-Delete Department Under School Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    When User should login succesfully
    And Click on the leftnav but no function
      | setup             |
      | schoolSetup       |
      | schoolDepartments |

  Scenario: Fill in the information and add, for the department

    And Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Aircraft technician |
      | codeInput | AT0034              |
    And Click on the element in Dialog
      | section |
    Then Fill out the form stale element
      | shortName | ATM01                |
      | nameInput2 | Aircraft Maintenance |
    And Click on the element in Dialog
      | FormAddBtn |
      | saveButton |

    Then verify process

  Scenario: Filling in the same information and adding should not be done.

    And Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Aircraft technician |
      | codeInput | AT0034              |
    And Click on the element in Dialog
      | section |
    Then Fill out the form stale element
      | shortName | ATM01                |
      | nameInput2 | Aircraft Maintenance |
    And Click on the element in Dialog
      | FormAddBtn |
      | saveButton |

    Then verify process but negative

  Scenario: Fill in the information and edit, for the department

    When Click on the element in Dialog
      | lastItemEditBtn |
    And Fill out the form
      | nameInput2 | Aircraft Technician |
      | codeInput | AT0034              |
    And Click on the element in Dialog
      | saveButton |
    Then verify process

  Scenario:It should be able to be deleted by clicking the delete button and confirming it

    When Click on the element in Dialog
      | lastItemDeleteBtn |
      | deleteDialogBtn   |
    Then verify process

  Scenario: Should not be deleted.
    Then Read on list,for search my data name