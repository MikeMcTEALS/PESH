# Computer Science 2 - Unit 5 - Lab #2
## Decision Making using nested if..else statements

Complete the following:
- Test case worksheet
- RockPaperScissors.java, RockPaperScissorsTester.java


### Lab Goal  
The lab packet was designed to give you practice using nested if..else statements, 
switch statements and String comparison methods.

### Files Needed  
RockPaperScissors.java and RockPaperScissorsTester.java

## Rock/Paper/Scissors
Write a program which simulates the popular game, Rock/Paper/Scissors.

```
The RockPaperScissors class:
RockPaperScissors   has two instance fields:
personPlay: 	    a String representation of the person’s play (R, P, or S)
computerPlay:	    a String representation of the computer’s play (also R, P or S)
```

- The constructor receives a String value for the person’s play.  
- The value is converted to upper case, in case the received value is lower case.  
- The computer’s play is generated randomly.  
- In the constructor, a random number 0, 1 or 2 has already been generated for you.  
You will use a switch statement to assign a value to computerPlay 
based on this random number.

There are two accessor methods, one for each instance field. These are completed for you.

The getWinner method returns a String that declares the winner of the game.  
This method will use the nested if..else structure to examine the person’s play 
and the computer’s play and determine the winner – or a tie.  The challenge is to 
accommodate all possible combinations of person and computer play.  

Use the Test Case worksheet to plan your algorithm.

### The RockPaperScissorsTester class
You will use the Scanner class to get user input from the keyboard in the tester class.  
There are three steps in creating the tester:
1. Prompt the user for their play, and read it in
1. Create the RockPaperScissors object
1. Print the computer’s play and winner using RockPaperScissors methods.

Sample output (it will take many executions to fully test the program):

Play Rock Paper Scissors:
Enter your play: R, P, or S ==> r
Person play is R
Computer play is S
Rock crushes scissors - you win!


