// Your heading here!

/**
 * A game of Rock, Paper, Scissors that the user plays against a computer
 */
public class RockPaperScissors
{
    private String personPlay;
    private String computerPlay;

    /**
     * constructs a RockPaperScissors object with a specified play for the
     * person playing the game. If the specified play is invalid, the
     * person's play will default to "R".  Randomly picks a play for the computer.
     * @param person the person's play: R, P or S.
     */
    public RockPaperScissors(String person)
    {
        personPlay = person.toUpperCase(); // makes it uppercase regardless of what is sent

        /* TO DO: If personPlay (after assigning it from person) is not a valid play ("R", "P", or "S"),  make it "R".  */

        int computerInt = (int)(Math.random() * 3);  // computerInt is 0, 1 or 2

	    /**
         *  TO DO: Use a switch statement to assign computerPlay based on computerInt
         *  For example, if computerInt is 0, make the computerPlay "R".  1 => "P", 2 => "S" *
        */

    }

    /**
     * returns the computer's play R, P or S
     * @return the computer's play
     */
    public String getComputerPlay()
    {
        return computerPlay;
    }

    /**
     * returns the person's play R, P or S
     * @return the person's play
     */
    public String getPersonPlay()
    {
        return personPlay;
    }


    /**
     * Returns a phrase describing the winner of the game based on
     * the rules, for instance:
     * "Rock crushes Scissors - computer wins!"
     * @return the phrase describing the winner
     */
    public String getWinner()   // uses nested if..else
    {

        // Use nested if..else here
        // Refer to the Test Case worksheet for the algorithm
        return "";
    }
}