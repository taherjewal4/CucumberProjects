Feature: Login Test For FaceBook

  Background: login test only
    Given User landed on loginPag
    When User gives Ivnvalid UserName
    Then User Gives Invalid Password
    Then User Click on login Button
    And User get error text


  Scenario: Login Test With printing log
    Given User landed on loginPag
    When User gives Ivnvalid UserName
    Then User Gives Invalid Password
    Then User Click on login Button
    And User get error text
#    Then User Print the Name


  Scenario: Login Test With writein glog
    Given User landed on loginPag
    When User gives Ivnvalid UserName
    Then User Gives Invalid Password
    Then User Click on login Button
    And User get error text
#    Then User Write the name


  Scenario: Login Test With pnt log
    Given User landed on loginPag
    When User gives Ivnvalid UserName
    Then User Gives Invalid Password
    Then User Click on login Button
    And User get error text
#    Then User Write the name
#    Then User Come to pnt