Feature: Gmail Login

Scenario: verify after entering valid email and password gmail login successfull
	Given user should be registered
	When open gmail and enter valid credentials
	Then gmail login should be successful 