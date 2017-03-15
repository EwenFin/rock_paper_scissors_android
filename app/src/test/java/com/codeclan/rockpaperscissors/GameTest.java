package com.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class GameTest {

    Game game;
    HumanPlayer humanPlayer;
    ComputerPlayer computerPlayer;

    @Before
    public void setup() {
        humanPlayer = new HumanPlayer();
        computerPlayer = new ComputerPlayer();
        game = new Game();
    }

    @Test
    public void testPlayHumanWins() {
        String winner = game.play(Choice.ROCK, Choice.SCISSORS);
        assertEquals("You Win!", winner);
    }

    @Test
    public void testComputerWins() {
        String winner = game.play(Choice.ROCK, Choice.PAPER);
        assertEquals("You Lose Suckaaaa!", winner);
    }

    @Test
    public void testDraw() {
        String winner = game.play(Choice.PAPER, Choice.PAPER);
        assertEquals("It's a draw of course!", winner);
    }

}