Feature: Validating Place APIs
  Scenario: Verify if place is Successfully added using AddPlace API
    Given Add place Payload is prepared
    When user calls "AddPlace" API with a POST HTTP request
    Then the API call receives a successful response with Status code 200
    And the "status" in the response body is "OK"
    And "scope" in response body is "APP"
