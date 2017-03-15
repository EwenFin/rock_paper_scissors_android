package com.codeclan.rockpaperscissors;


import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by David Hale on 15/03/2017.
 */

public class ComputerPlayer {

    public Choice pickRandomChoice() {
        int randomNum = ThreadLocalRandom.current().nextInt(0,3);
        Choice choice = Choice.values()[randomNum];
        return choice;

    }

    public Choice playRock() {
        return Choice.ROCK;
    }

    public Choice playPaper() {
        return Choice.PAPER;
    }

    public Choice playScissors() {
        return Choice.SCISSORS;
    }

    public Choice makeAMove(Choice choice) {
        return choice;

    }

}
