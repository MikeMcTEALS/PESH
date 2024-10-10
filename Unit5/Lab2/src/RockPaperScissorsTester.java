// Your heading here!


import java.util.Scanner;

/**
 * A class to manage user interaction for a game with the RockPaperScissors class
 */
public class RockPaperScissorsTester
{
    /**
     * Tests methods of the RockPaperScissors class
     * @param args not used
     */
    public static void main(String[] args)
    {
        /**
         * Tests methods of the RockPaperScissors class
         * @param args not used
         */
        System.out.println("Play Rock Paper Scissors:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your play:R, P, or S ==> ");
        RockPaperScissors game = new RockPaperScissors(scanner.next());

        System.out.println("Your choice: " + game.getPersonPlay());
        System.out.println("Computer choice: " + game.getComputerPlay());
        System.out.println("Winner: " + game.getWinner());
    }
}







