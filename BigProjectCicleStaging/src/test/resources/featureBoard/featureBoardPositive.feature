@Board-Positive
Feature: Test functionality Board Page
  Background: user already login with register test

    @Positive-Add-New-List
    Scenario: User can creat new list on board
      Given User navigate to Board menu
        When User click add list
        And User input list name
        And User click button creat list
      Then User success create list

    @Positive-Add-New-Card
    Scenario: User can creat new car on list
      Given User navigate to Board menu
        When User click button add new card
        And User input card name
        And User click button add card
      Then User success create card name

    @Positive-Archive-Card
    Scenario: User can archive card on list
      Given User navigate to Board menu
        When User click button edit
        And User click button archive
      Then User success archive card