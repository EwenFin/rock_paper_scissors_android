package com.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by David Hale on 15/03/2017.
 */

public class HumanPlayerTest {

    HumanPlayer humanPlayer;

    @Before
    public void setup() {
        humanPlayer = new HumanPlayer();
    }

    @Test
    public void testPlayRock() {
        Choice choice = humanPlayer.playRock();
        assertEquals(Choice.ROCK, choice);
    }

    @Test
    public void testPlayPaper() {
        Choice choice = humanPlayer.playPaper();
        assertEquals(Choice.PAPER, choice);
    }

    @Test
    public void testPlayScissors() {
        Choice choice = humanPlayer.playScissors();
        assertEquals(Choice.SCISSORS, choice);
    }



}
