Feature:Register feature

  Scenario Outline:user can register his account with valid fake outline data
    Given  user go to register page
    When when user enter vaalid "<email>" and "<name>"
    And   click on sign up button

    Examples:
      |email                |    name |
      |khloud@moulld.com    |  khloud  |
      |khloud555@moulld.com |  khloud  |
      |khloud45@moulld.com  |  khloud  |
      |khloud78@moulld.com  |  khloud  |

