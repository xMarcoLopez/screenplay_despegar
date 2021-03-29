Feature: Search package
  AS a customer
  I want to search for a package
  TO pick a package

  Scenario: Search for a package with departure Medellin and destination Santa Marta with
    accommodation in Santa Marta
      Given Daniel wants to search for a package
      When Daniel enters departure Medellin and destination Santa Marta
      Then Daniel should see the resume page