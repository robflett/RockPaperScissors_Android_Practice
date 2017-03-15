package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RockPaperScissorsActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView scoreView;
//    RockPaperScissors game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);

        rockButton = (Button)findViewById(R.id.rockButton);
        paperButton = (Button)findViewById(R.id.paperButton);
        scissorsButton = (Button)findViewById(R.id.scissorsButton);

    }

    public void onRockButtonClicked(View view) {
        Intent intent = new Intent(this, RockActivity.class);
        startActivity(intent);
    }

    public void onPaperButtonClicked(View view) {
        Intent intent = new Intent(this, PaperActivity.class);
        startActivity(intent);
    }
    public void onScissorsButtonClicked(View view) {
        Intent intent = new Intent(this, ScissorsActivity.class);
        startActivity(intent);
    }


}
