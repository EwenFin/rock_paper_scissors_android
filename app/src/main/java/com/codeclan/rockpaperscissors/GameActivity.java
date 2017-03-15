package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TextView instructionText;
    Button rockButton;
    Button paperButton;
    Button scissorsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        instructionText = (TextView) findViewById(R.id.instruction_text);

        instructionText.setText("Pick an Option...");

        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorsButton = (Button)findViewById(R.id.scissors_button);
    }

    public void onRockButtonClicked(View button) {
        HumanPlayer humanPlayer = new HumanPlayer();
        int choiceInt = 1;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", 0);

        startActivity(intent);
    }

    public void onPaperButtonClicked(View button) {
        HumanPlayer humanPlayer = new HumanPlayer();
        int choiceInt = 1;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", 1);

        startActivity(intent);
    }

    public void onScissorsButtonClicked(View button) {
        HumanPlayer humanPlayer = new HumanPlayer();
        int choiceInt = 1;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", 2);

        startActivity(intent);
    }
}
