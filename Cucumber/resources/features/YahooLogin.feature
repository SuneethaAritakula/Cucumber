Feature: Yahoo Login

Scenario: This scenario verifies the elements of Yahoo Sign In
Given I navigate to Yahoo Log in page
When I verify username field is available
And I verify next tab is available
And I verify stay signed in check box is available
And I verify Trouble Signing in text is available
And I verify create account atb is available

Scenario: This scenario verifies Yahoo Account log in
Given I am on Yahoo log in page
When I input Username
And click on next tab
Then I input password
And click on sign in tab
Then I should be able to successfully login







