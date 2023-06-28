@Login
Feature: Login 
  I want to use this template for my feature file

  @negative
  Scenario: invalid Login
    Given User open login page
    When User input invalid <email> and <password>
    And User click login
    Then Login failed
    
  @positive
  Scenario: valid login
    Given User open login page
    When User input invalid <email> and <password>
    Then Login Success
