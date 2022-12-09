@Blast-Negative
Feature: Test functionality blast Page
  Background: user already login with register test

  @Negative-Add-New-Blast
  Scenario: User can create new Blast with blank title and description
    Given User navigate to Blast menu
      When User click button Create Blast
      And User click button publish
    Then User can't create new blast

  @Negative-Comment-at-Blast-Post
  Scenario: User can create comment on blast
    Given User navigate to Blast menu
      When User select post blast want comment
      And User click select comment
    Then User click button post