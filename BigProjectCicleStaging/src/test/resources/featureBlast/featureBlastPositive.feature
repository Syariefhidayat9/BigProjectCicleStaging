@Blast-Positive
  Feature: Test functionality blast Page
    Background: user already login with register test

      @Positive-Add-New-Blast
      Scenario: User can create new Blast
        Given User navigate to Blast menu
        When User click button Create Blast
        And User click title
        And User input title
        And User input tell story
        And User click button publish
      Then User successfully create new blast

      @Positive-Edit-Blast-Post
      Scenario: User can edit blast post
        Given User navigate to Blast menu
        When User select post blast want edit
        And User click tree dot button
        And User click edit menu
        And User input tell story
        And User click Save Change Button
      Then User successfully edit post blast

      @Positive-Comment-at-Blast-Post
      Scenario: User can create comment on blast
        Given User navigate to Blast menu
        When User select post blast want comment
        And User click select comment
        And User input tell story comment
        And User click button post
       Then User create comment successful


