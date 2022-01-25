Feature: Tests the successful loading of all reports

  Background:
    Given I navigate to EMR login page
#    When I enter the config user name and password
    When I enter username "TestRAAutomation" and password "Password2!3" in the text fields
    And I click on login to webpt button
    Then I view the EMR page and click on analytics tab

    @CancelsAndNoShowsReportsLoad @AllReportsLoad
    Scenario: Verify all reports under the Cancels and No Shows sub section successfully load
      When I see the analytics home page and click on reports tab
      And I navigate to the "Cancels" report
      Then I validate the "Cancels" report loads successfully
#      When I see the analytics home page and click on reports tab
#      And I navigate to the "No Shows" report
#      Then I validate the "No Shows" report loads successfully

