package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        Game game = new Game();
        ComputerPlayer computerPlayer = new ComputerPlayer();
        HumanPlayer humanPlayer = new HumanPlayer();

        Choice computerChoice = computerPlayer.pickRandomChoice();
        Log.d(getClass().toString(), computerChoice.toString());

        int humanChoiceInt = extras.getInt("choice");


        Choice humanChoice =  Choice.values()[humanChoiceInt];

        String result = game.play(humanChoice, computerChoice);

        resultText = (TextView)findViewById(R.id.result_text);
        resultText.setText(result);
    }
}
