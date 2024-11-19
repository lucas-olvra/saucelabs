#author: Eu

@login
Feature: login application

  Background: Access Screen login
    Given access screen "login"


  @web @login_correct
  Scenario: Validate login correct application
    When perform the login with the user
      | username    | password     |
      | visual_user | secret_sauce |
    Then check login performed with success