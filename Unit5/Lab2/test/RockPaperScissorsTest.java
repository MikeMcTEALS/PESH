import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

class RockPaperScissorsTest {
    private static Map<String, String> dictonary = new HashMap<>();

    @BeforeAll
    static void setUp() {
        dictonary.put("R", "Paper");
    }

    @Test
    void setPersonPlay() {
    }

    @Test
    void testRandomNextInt() {
        Random randomMock = Mockito.mock(Random.class);

        when(randomMock.nextInt(anyInt())).thenReturn(5);

        int result = randomMock.nextInt(10);

        assertEquals(5, result);

    }

    @Test
    @Disabled
    void getComputerPlay() {

    }

    @RepeatedTest(20)
    void userChoosesRock() {
        RockPaperScissors game = new RockPaperScissors("R");
        String computerChose = game.getComputerPlay();

        switch (computerChose) {
            case "R": assertEquals("TIE", game.getWinner());
            break;
            case "P": assertEquals("Computer wins - Paper wraps rock", game.getWinner());
            break;
            case "S": assertEquals("You win - Rock crushes scissors", game.getWinner());
            break;
        }
        System.out.println("Your choice: " + game.getPersonPlay());
        System.out.println("Computer choice: " + game.getComputerPlay());
        System.out.println("Winner: " + game.getWinner());
        System.out.println();
    }

    @RepeatedTest(20)
    void userChoosesPaper() {
        RockPaperScissors game = new RockPaperScissors("P");
        String computerChose = game.getComputerPlay();

        switch (computerChose) {
            case "R": assertEquals("You win - Paper wraps rock", game.getWinner());
                break;
            case "P": assertEquals("TIE", game.getWinner());
                break;
            case "S": assertEquals("Computer wins - Scissors cuts paper", game.getWinner());
                break;
        }

        System.out.println("Your choice: " + game.getPersonPlay());
        System.out.println("Computer choice: " + game.getComputerPlay());
        System.out.println("Winner: " + game.getWinner());
        System.out.println();
    }

    @RepeatedTest(20)
    void userChoosesScissors() {
        RockPaperScissors game = new RockPaperScissors("S");
        String computerChose = game.getComputerPlay();

        System.out.println("Your choice: " + game.getPersonPlay());
        System.out.println("Computer choice: " + game.getComputerPlay());
        System.out.println("Winner: " + game.getWinner());
        System.out.println();

        switch (computerChose) {
            case "R": assertEquals("Computer wins - Rock crushes scissors", game.getWinner());
                break;
            case "P": assertEquals("You win - Scissors cuts paper", game.getWinner());
                break;
            case "S": assertEquals("TIE", game.getWinner());
                break;
        }
    }

    @Test
    void getPersonPlay() {
    }

    @Test
    void getWinner() {
    }
}