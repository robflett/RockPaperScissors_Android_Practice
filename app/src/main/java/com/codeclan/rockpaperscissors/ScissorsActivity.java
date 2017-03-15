package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScissorsActivity extends AppCompatActivity {

    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scissors);

        resultView = (TextView)findViewById(R.id.scissorsResult);
        RockPaperScissors game = new RockPaperScissors();
        resultView.setText(game.compareHands("scissors"));
    }

    public void playAgain(View playAgainButton){
        Intent intent = new Intent(this, RockPaperScissorsActivity.class);
        startActivity(intent);
    }
}
