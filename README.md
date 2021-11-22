# StarSharpAuto
La Historia de usuario sobre la que se estará trabajando en la aplicación web StarSharp es la siguiente:
<pre>
Feature: StarSharp meetings
As an admin
  I want to create a new meeting
 
  So that I can communicate with the company members
  
 Frente a esta funcionalidad se identifican múltiples escenarios como lo son:
 -Verificar la creación de una nueva unidad y una nueva reunión.
 -Verificar la creación de una reunión usando una unidad ya creada.
 -Verificar la creación de una reunión sin unidad.
 -Verificar la creación de una reunión especificando la ubicación.
 -Verificar la creación de una reunión especificando el organizador.
 -Verificar la creación de una reunión con lista de asistentes.
 -verificar que no se puede crear la reunión al no ingresar un nombre de reunión
 -verificar que no se puede crear la reunión al no ingresar el tipo de reunión
 -verificar que no se puede crear la reunión al ingresar fechas erróneas
 
 Se decide automatizar dos de los escenarios mencionados anteriormente.
 
  Background:
    Given That the admin is authenticated in the StarSharp page
 
  @scenario1
  Scenario: Creating a new meeting with a new Business Unit in StarSharp
    When the admin creates a new Business Unit
    And the admin schedule a new meeting
    Then the meeting should be created

  @scenario2
  Scenario: Checking the error message when the end time is before the meeting start time
    When the admin creates a new Business Unit
    And the admin schedule a new meeting
    Then an error message should be displayed
 </pre>
