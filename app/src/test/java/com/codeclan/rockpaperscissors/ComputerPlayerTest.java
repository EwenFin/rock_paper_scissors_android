package com.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by David Hale on 15/03/2017.
 */

public class ComputerPlayerTest {

    ComputerPlayer computerPlayer;

    @Before
    public void setup() {
        computerPlayer = new ComputerPlayer();
    }

    @Test
    public void testGivesRandomChoice() {
        Choice choice = computerPlayer.pickRandomChoice();
        System.out.println(choice.toString());
        assertNotNull(choice);
    }

//    @Test
//    public void testMakeAMove(){
//        Choice choice = computerPlayerCanPlay.makeAMove(Choice.ROCK);
//        assertEquals(Choice.ROCK, choice);
//    }



}
