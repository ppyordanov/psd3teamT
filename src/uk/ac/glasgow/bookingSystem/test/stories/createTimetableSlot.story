Narrative :

In order to be able to administer the system
As an administrator

I want to be able to create a timetable slot for students to sign up


Scenario : Administrator creating a laboratory slot for Biology lvl1 course

Given a Microbiology course
When the timeslot does not clash with the course lectures/tutorials (other slots)
Then create the time slot
And add it to the course sessions

Scenario : Admin creating a Business & Management tutorial

Given a Financial Accounting course
When the tutorial timeslot does not clash with the course lectures/tutorials (other slots)
Then create the time slot
And add it to the course sessions
