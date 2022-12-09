@Board-Negative
Feature: Test functionality Board Page
  Background: user already login with register test

    @Negative-Add-New-List
    Scenario: User can creat new list on board
      Given User navigate to Board menu
        When User click add list
      Then User click button creat list

    @Positive-Add-New-Card
    Scenario: User can creat new car on list
      Given User navigate to Board menu
        When User click button add new card
        And User click button add card
      Then User have pop up message error add card negative