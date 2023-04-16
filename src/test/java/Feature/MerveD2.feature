Feature: Add-Edit-Delete operations in the Parameters-Grade Levels Page

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the leftnav
      | setup             |
      | schoolSetup       |
      | gradeLevels       |

  Scenario: Add a new Position in the Grade Levels Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Mrv1234 |
      | shortName  | mrv   |
      | order  | 1 |
      | nextGrade  | None   |

    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Add a Position which is already added in the Locations Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Mrv1234 |
      | shortName  | mrv   |
      | order  | 1 |
      | nextGrade  | None   |

