Feature: Compose and send email
  Scenario Outline: Send email with subject and body
    Given User is on gmail login page
    When User Enters User Name and password
    When User writes an email with "<subject>"  and "<body>" 
    Then User verifies that email sent success message 
Examples:
|subject|body|
|Incubyte|Automation QA test for Incubyte|
