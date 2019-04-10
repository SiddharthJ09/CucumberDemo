Feature: Login 


 # Scenario: Title of your scenario
 #   Given User is on login page
 #   When user enters "admin" and "admin123"
 #   And Click login buttons
 #   Then User must see dashboard and close browser
    
 #   Scenario Outline: Title of your scenario
 #   Given User is on login page
 #   When user enters "<username>" and "<password>"
 #   And Click login buttons
 #   Then User must see dashboard and close browser
		
	#	Examples: 
	#	|username|password|
	#	|admin|admin123|
	

  Scenario: Title of your scenario
    Given User is on login page
    When user enters username and password
    |Username|Password|
    |admin|admin123|
    And Click on login button
    Then User on dashboard and close browser
	

