package com.codeclan.rockpaperscissors;

/**
 * Created by David Hale on 15/03/2017.
 */

public class Game {



    public Game() {
    }

    public String play(Choice choice1, Choice choice2) {
        String string = null;
        if (((choice1 == Choice.ROCK) && (choice2 == Choice.SCISSORS) )||((choice1 == Choice.PAPER) && (choice2 == Choice.ROCK))||(choice1 == Choice.SCISSORS && choice2 == Choice.PAPER)) {
                string = "You Win!";
            }   else if ((choice1 == Choice.ROCK && choice2 == Choice.PAPER) ||(
            choice1 == Choice.PAPER && choice2 == Choice.SCISSORS) ||(
            choice1 == Choice.SCISSORS && choice2 == Choice.ROCK)) {
                string = "You Lose Suckaaaa!";
        } else { string = "Draw";}
        return string;
    }


}
