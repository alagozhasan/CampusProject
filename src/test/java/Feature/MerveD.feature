Feature: Add-Edit-Delete operations in the School Setup/Locations Page

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the leftnav
      | setup             |
      | schoolSetup       |
      | schoolLocations |

  Scenario: Add a new Position in the Locations Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Mrv123 |
      | shortName  | Mrv   |
      | LocationType  | Classroom |
      | capacity  | 110   |

    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is successfully

  Scenario: Add a Position which is already added in the Locations Page
    When Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput2 | Mrv123 |
      | shortName  | Mrv   |
      | LocationType  | Classroom |
      | capacity  | 110   |

    And Click on the element in Dialog
      | saveButton |
    Then Verify the notification message that is already exist



















