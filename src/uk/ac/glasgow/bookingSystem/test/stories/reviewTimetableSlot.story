Narrative :

In order to be able to administer the course sessions (timeslots)
As an administrator

I want to be able to make changes to the created sessions,
And be able to delete them


Scenario : Admin changing the laboratory timeslot and location

Given a Coumputing Science course
When the new laboratory timeslot time does not clash with the course lectures/tutorials (other slots)
And the location is not occupied at the new timing
Then modify the lab session time and location

Scenario : Admin changing the frequency of a tutorial to twice/week

Given a Psychology course
When the course is once/week
Then modify it to twice/week
