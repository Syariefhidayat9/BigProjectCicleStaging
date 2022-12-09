@GroupChat-Negative
Feature: Test functionality Group Chat Page
  Background: user already login with register test

  @Negative-Add-New-Chat
  Scenario: User can create new Chat
    Given User navigate to Group Chat
    When  User click Collom Type message here
    And User input Blank message
    Then click button send