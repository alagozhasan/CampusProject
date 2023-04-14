Feature: Add-Edit-Delete operations in the Attentions

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    When User should login succesfully

  Scenario: Add a new Attestation in the Attestations Page

    And Click on the leftnav
      | humanResources |
      | hRSetup        |
      | attestations   |

    And Click on the element in Dialog
      | addButton |

    And Fill out the form
      | nameAttestation | SamBay34 |

    And Click on the element in Dialog
      | saveButton |

    Then Verify that notification messages “Attestation successfully created”

  Scenario: Add a Attestation which is already added in the Attestations Page

    And Click on the leftnav
      | humanResources |
      | hRSetup        |
      | attestations   |

    And Click on the element in Dialog
      | addButton |

    And Fill out the form
      | nameAttestation | SamBay34 |

    And Click on the element in Dialog
      | saveButton |

    Then Verify that notification messages “The Attestation with Name "SamBay34" already exists.”

  Scenario: Edit the added Attestation in the Attestations Page

    And Click on the leftnav
      | humanResources |
      | hRSetup        |
      | attestations   |

    And Fill the search field for added Attestation

    And Click on the element in Dialog
      | searchButton |

    And Click on the element in Dialog
      | editButton |

    And Fill out the form
      | nameAttestation | SamBay345 |

    And Click on the element in Dialog
      | saveButton |

    Then Verify that notification messages “Attestation successfully updated”

  Scenario: Delete the added Attestation in the Attestations Page

    And Click on the leftnav
      | humanResources |
      | hRSetup        |
      | attestations   |

    And Fill the search field for edited Attestation

    And Click on the element in Dialog
      | searchButton |

    When Click on the element in Dialog
      | lastItemDeleteBtn |
      | deleteDialogBtn   |

    Then Verify that notification messages “Attestation successfully deleted”

  Scenario: Delete the Attestation which is already deleted in the Attestations Page

    And Click on the leftnav
      | humanResources |
      | hRSetup        |
      | attestations   |

    And Fill the search field for edited Attestation

    And Click on the element in Dialog
      | searchButton |

    Then Verify that notification messages “There is no data to display”