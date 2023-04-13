Feature:

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    When User should login succesfully

  Scenario: closing test of Dropdown menus
    And Click on the leftnav but no function
      | setup             |
      | schoolSetup       |
      | schoolDepartments |
    Then Click on the leftnav arrow
      | schoolSetupArrow |
      | SetupArrow       |
      And verify dropdown menu

  Scenario: Fill in the information and add, for the department
    And Click on the leftnav
      | setup             |
      | schoolSetup       |
      | schoolDepartments |
    And Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput | Aircraft technician |
      | codeInput | AT0034              |

    And Click on the element in Dialog
      | section |

    Then Fill out the form
      | nameInput | Aircraft Maintenance |
      | shortName | ATM01                |
    And Click on the element in Dialog
      | FormAddBtn |
      | saveButton |

    Then verify process

  Scenario: Filling in the same information and adding should not be done.

    Given Navigate to Campus
    When Enter username and password and click login button
    When User should login succesfully
    And Click on the leftnav
      | setup             |
      | schoolSetup       |
      | schoolDepartments |
    And Click on the element in Dialog
      | addButton |
    And Fill out the form
      | nameInput | Aircraft technician |
      | codeInput | AT0034              |

    And Click on the element in Dialog
      | section |

    Then Fill out the form
      | nameInput | Aircraft Maintenance |
      | shortName | ATM01                |
    And Click on the element in Dialog
      | FormAddBtn |
      | saveButton |

    Then verify process but negative

  Scenario: Fill in the information and edit, for the department
    And Click on the leftnav
      | setup             |
      | schoolSetup       |
      | schoolDepartments |
    When Click on the element in Dialog
      | lastItemEditBtn |

    And Fill out the form
      | nameInput | Aircraft Technician |
      | codeInput | AT0034              |

    And Click on the element in Dialog
      | section |

    Then Fill out the form
      | nameInput | Line Maintenance |
      | shortName | ATL01            |

    And Click on the element in Dialog
      | FormAddBtn |
      | saveButton |

    Then verify process

  Scenario:It should be able to be deleted by clicking the delete button and confirming it
    And Click on the leftnav
      | setup             |
      | schoolSetup       |
      | schoolDepartments |
    When Click on the element in Dialog
      | lastItemDeleteBtn |
      | deleteDialogBtn   |

    Then verify process

  Scenario: Should not be deleted.
    And Click on the leftnav
      | setup             |
      | schoolSetup       |
      | schoolDepartments |
    Then Read on list,for search my data name