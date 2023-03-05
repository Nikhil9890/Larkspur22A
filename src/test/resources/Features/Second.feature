@tag
Feature: This is second feature
@tag1
    Scenario: verify that popular product list must be sublist of other brands
    Given user click on comparenow button
    When User click on select car icon
    Then Check your all product under popular brands present in other brands
    