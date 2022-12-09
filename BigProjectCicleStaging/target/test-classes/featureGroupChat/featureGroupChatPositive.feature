@GroupChat-Positive
Feature: Test functionality Group Chat Page
  Background: user already login with register test

  @Positive-Add-New-Chat
  Scenario: User can create new Chat
    Given User navigate to Group Chat
      When  User click Collom Type message here
      And User input message
    Then click button send

  @Positive-Delete-chat
  Scenario: User can delete chat
    Given User navigate to Group Chat
      When  User click message what you want delete
      And User click option Delete
      And User click button delete message
      And User click button delete pop up delete
    Then User success delet group chat


