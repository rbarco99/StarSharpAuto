# Autor: Ricardo Barco
@Stories
Feature: StarSharp meetings
  As an admin
  I want to create a new meeting
  Background:
    Given That the admin is authenticated in the StarSharp page
  @scenario1
  Scenario: Creating a new meeting with a new Business Unit in StarSharp
    When the admin creates a new Business Unit
      | businessUnitName  |
      | StarSharp Unit    |
    And the admin schedule a new meeting
      | meetingName       |meetingType  |startDate  |startHour|locationName  |locationAddress|organizerFirstName|organizerLastName|organizerUser|organizerDomain|meetingNumber|endDate   |endHour|unit              |
      | MeetingAuto       |Team Meeting |12/20/2021 |10:40    |Bogota offices|Cra10#20 11    |Ricardo           |Rodriguez        |rrodr12      |starsharpp.com |042          |12/23/2021|12:05  |StarSharp Unit    |
    Then the meeting should be created
      | MeetingName      |
      | MeetingAuto      |
  @scenario2
  Scenario: Checking the error message when the end time is before the meeting start time
    When the admin creates a new Business Unit
      | businessUnitName  |
      | StarSharp Unit3   |
    And the admin schedule a new meeting
      | meetingName       |meetingType  |startDate  |startHour|locationName  |locationAddress|organizerFirstName|organizerLastName|organizerUser|organizerDomain|meetingNumber|endDate   |endHour|unit              |
      | FailMeeting       |Team Meeting |12/23/2021 |10:30    |Bogota offices|Cra10#20 11    |Ricardo           |Rodriguez        |rrodr12      |starsharpp.com |4252         |12/23/2021|10:10  |StarSharp Unit3   |
    Then an error message should be displayed
