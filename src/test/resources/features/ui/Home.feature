@ui
Feature: Verify HomePage Functionalities

  Scenario: Verify user can log out the application
    Given user open the website
    When user enter "login.username" as username and "login.password" as password
    Then verify user is navigated to home page
    When user click on profile picture
    And user click on logout link
    Then verify user is navigated to login page
    And verify user get success logout message

  Scenario: Verify user can update profile
    Given user open the website
    When user enter "login.username" as username and "login.password" as password
    Then verify user is navigated to home page
    When user click on profile picture
    And user click on my profile link
    Then verify user is navigated to profile page
    When verify user can update followings first "title.new","first.name","last.name"
    And verify user can update followings second "home.phone","mobile.phone","work.phone"
    And verify user can update followings third "address.new","locality.new","region.new","postal.code","country.new"
    Then verify user get success profile update message


  Scenario: Verify user can change the password
    Given user open the website
    When user enter "login.username" as username and "login.password" as password
    Then verify user is navigated to home page
    When user click on profile picture
    And user click on change password link
    Then verify user is navigated to change password page
    When verify user can update "login.password" to the new credentials "new.password","confirm.password"
    Then verify user get success password update message