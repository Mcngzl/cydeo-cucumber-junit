Feature: Wikipedia search functionality and verification


  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Bill Gates" in the wiki search box
    And User clicks wiki search button
    Then user sees "Bill Gates" is in the wiki title

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  @scenariooutline
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then user sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header
    @succerplayers
    Examples: search values we are going to be using in this scenario is as below
      | searchValue        | expectedTitle      | expectedMainHeader |
      | Steve Jobs         | Steve Jobs         | Steve Jobs         |
      | Bob Marley         | Bob Marley         | Bob Marley         |
      | Kate Winslet       | Kate Winslet       | Kate Winslet       |
      | Christiano Ronaldo | Christiano Ronaldo | Christiano Ronaldo |
    @artists
    Examples:search values we are going to be using in this scenario is as below
      | searchValue        | expectedTitle      | expectedMainHeader |
      | Kate Winslet f     | Kate Winslet f     | Kate Winslet f     |
      | Christiano Ronaldo | Christiano Ronaldo | Christiano Ronaldo |