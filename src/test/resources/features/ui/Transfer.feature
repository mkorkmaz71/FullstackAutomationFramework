@ui
Feature: Verify Transferring Functionality

  Scenario: Verify user can create transfer money from one account to another account
    Given user open the website
    When user enter "login.username" as username and "login.password" as password
    Then verify user is navigated to home page
    When user click on transfer between accounts tab
    Then verify internal transfer page is displayed
    When user select "w.account.name" from account dropdown and "d.account.name" to account dropdown
    And enter the transfer "t.amount" as amount
    And click on transfer submit button
    Then after transfer verify "d.account.name" on checking-savings account page is displayed
    And verify transfer entry "t.amount" at "d.account.name" is displayed in the transaction history