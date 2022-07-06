  Feature: Validate Smart Bear Software Page

@Smoke
 Scenario: Validate invalid login attempt
  Given user is on "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx"
  When user enters username as "abcd"
  And user enters password as "abcd1234"
  And user clicks on Login button
  Then user should see "Invalid Login or Password." Message

@Smoke
  Scenario: Validate valid login attempt
  Given user is on "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx"
    When user enters username as "Tester"
    And user enters password as "test"
    And user clicks on Login button
    Then user should be routed to "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/"

#  @Smoke
#    Scenario: Validate "Web Orders" menu items
#      When user enters username as "Tester"
#      And user enters password as "test"
#      And user clicks on Login button
#      Then user should be routed to "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/"
#      And validate below menu items are displayed
#        | View all orders | View all products | Order |
#   */