Feature: Book My Show
  I want to book my movie tickets

 

  Scenario: Login as a authenticated user
    Given user is on homepage
    When user navigates to Login Page
    And user enters valid mobilenumber
    Then click continue
    Then success message is displayed
    
    Scenario: Login as a unauthenticated user
    Given user is on homepage
    When user navigates to Login Page
    And user enters invalid mobilenumber
    Then click continue
    Then success message is displayed
    
    Scenario: Login as a authenticated user
    Given user is on homepage
    Then click on search
    
    Scenario:Login as a authenticated user
    Given user is on homepage
    Then click on search
   
    Scenario: Login as a authenticated user
    When user enter the movies
    Then it shows all the movies available
    