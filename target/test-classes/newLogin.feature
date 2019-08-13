Feature: Login Test For FaceBook


  Scenario: login test only
    Given User landed on loginPag
    When User gives Ivnvalid UserName
    Then User Gives Invalid Password
    Then User Click on login Button
    And User get error text

#  Scenario Outline: Facebook login with set of data
#    When User Gives "<email>" And "<pass>"
#    When user click on the login button
#    Then user should be on the facebook homepgae
#
#    Examples:
#
#      | email                    | pass        |
#      | taherjuwel3262@gmail.com | Juwel1234   |
#      | taherjuwel3262@gmail.com | Juwel876234 |
#      | taherjuwel3262@gmail.com | Juwel123o4  |