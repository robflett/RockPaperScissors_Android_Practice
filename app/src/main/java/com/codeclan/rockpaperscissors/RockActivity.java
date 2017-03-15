package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RockActivity extends AppCompatActivity {

    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        resultView = (TextView)findViewById(R.id.rockResult);
        RockPaperScissors game = new RockPaperScissors();

        resultView.setText(game.compareHands("rock"));

    }

    public void playAgain(View playAgainButton){
        Intent intent = new Intent(this, RockPaperScissorsActivity.class);
        startActivity(intent);
    }
}
