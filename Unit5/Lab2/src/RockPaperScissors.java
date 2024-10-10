// Your heading here!

import java.util.Random;

/**
 * A game of Rock, Paper, Scissors that the user plays against a computer
 */
public class RockPaperScissors
{
    private String personPlay;
    private String computerPlay;

    void setPersonPlay(String personPlay) {
        this.personPlay = personPlay.toUpperCase();
    }

    /**
     * constructs a RockPaperScissors object with a specified play for the
     * person playing the game. If the specified play is invalid, the
     * person's play will default to "R".  Randomly picks a play for the computer.
     * @param person the person's play: R, P or S.
     */
    public RockPaperScissors(String person)
    {
        setPersonPlay(person);

        /*
         * If personPlay (after assigning it from person)
         * is not a valid play ("R", "P", or "S"),  make it "R".
         */
        if (personPlay.equals("R") || personPlay.equals("P") || personPlay.equals("S")) {
            generateComputerPlay();
        }
        else setPersonPlay("R");
    }

    private void generateComputerPlay() {
        int computerInt = (int)(Math.random() * 3);  // computerInt is 0, 1 or 2

        switch (computerInt) {
            case 0 -> this.computerPlay = "R";
            case 1 -> this.computerPlay = "P";
            case 2 -> this.computerPlay = "S";
            default -> throw new IllegalStateException("Unexpected value: " + computerInt);
        }
    }

    /**
     * returns the computer's play R, P or S
     * @return the computer's play
     */
    public String getComputerPlay()
    {
        return this.computerPlay;
    }

    /**
     * returns the person's play R, P or S
     * @return the person's play
     */
    public String getPersonPlay()
    {
        return this.personPlay;
    }


    /**
     * Returns a phrase describing the winner of the game based on
     * the rules, for instance:
     * 1. Rock crushes scissors
     * 2. Scissors cut paper
     * 3. Paper wraps rock
     * "Rock crushes Scissors - computer wins!"
     * @return the phrase describing the winner
     */
    public String getWinner()   // uses nested if..else
    {
        String outcome;

        // Use nested if..else here
        // Refer to the Test Case worksheet for the algorithm
        if (this.personPlay.equals(this.computerPlay)) {
            outcome = "TIE";
        }
        else {
            if (getPersonPlay().equals("R")) {
                if (getComputerPlay().equals("P")) {
                    outcome = "Computer wins - Paper wraps rock";
                } else {
                    outcome = "You win - Rock crushes scissors";
                }
            }
            else if (getPersonPlay().equals("P")) {
                if (getComputerPlay().equals("S")) {
                    outcome = "Computer wins - Scissors cuts paper";
                }
                else {
                    outcome = "You win - Paper wraps rock";
                }
            }
            else { // User = Scissors
                if (getComputerPlay().equals("R")) {
                    outcome = "Computer wins - Rock crushes scissors";
                }
                else {
                    outcome = "You win - Scissors cuts paper";
                }
            }
        }
        return outcome;
    }
}