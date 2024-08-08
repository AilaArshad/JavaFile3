# JavaFile3
Assignment3

**Cricket Scorecard Application**

Develop a console-based cricket scorecard application that simulates a cricket match, calculates 
scores, and determines the winner.

**Requirements:**

• Accept input for team names.

• Conduct a virtual toss to determine the batting order.

• Allow for a maximum of 20 overs per innings.

• Store player names in a string array.

• Calculate and display individual and team scores.

• Calculate and display strike rates.

• Determine the winning team based on total scores.

**Task Breakdown**

**1. User Input:**

o Prompt the user to enter the names of two cricket teams.

o Simulate a toss and determine the batting order.

o Set the number of overs per innings (20 in this case).

**2. Player Data:**
   
o Create two string arrays to store the names of 11 players for each team.

o You can either hardcode player names or allow the user to input them.

**3. Scorekeeping:**
 
o Initialize variables to track the following for each batsman:

▪ Name

▪ Runs scored

▪ Balls faced

▪ Out or Not Out

o Initialize variables to track the following for each team:

▪ Total runs

▪ Wickets fallen

▪ Overs bowled

o Implement logic to simulate the batting innings, including:

▪ Bowling overs

▪ Scoring runs

▪ Wicket falls

▪ Calculating strike rates (runs/balls faced * 100)

**4. Score Display:**
 
o Create a formatted scorecard displaying the following information for each 
batsman:

▪ Name

▪ Score

▪ Out/Not Out

▪ Balls faced

▪ Strike rate

o Display the total score for the team in the format: "Total score X/Y in Z overs"

**5. Winning Team:**
   
o Compare the total scores of both teams.

o Declare the team with the higher score as the winner.
