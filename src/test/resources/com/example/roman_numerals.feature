Feature: Roman numerals conversion

  Scenario Outline: Convert an integer to a Roman numeral
    Given the number <number>
    When I convert it to a Roman numeral
    Then the result should be "<roman>"

    Examples:
      | number | roman |
      | 1      | I     |
      | 2      | II    |
      | 3 | III |
      | 4 | IV |
      | 5 | V |
      | 9 | IX |
      | 10 | X |