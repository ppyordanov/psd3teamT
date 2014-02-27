Narrative :

In order to be able to identify teaching sessions
As an administrator

I want to be able to import a MyCampus course


Scenario : Lecturer importing a Computing science course

Given a Systems lvl2 course
When the course does not exist on the booking system
Then import the course metadata and session information
And add the imported course to the system course list
