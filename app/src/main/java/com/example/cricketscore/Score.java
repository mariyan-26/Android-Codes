package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {
    private TextView teamOneNameTextView, teamTwoNameTextView, dateTextView, totalScoreTextView;
    private Button scoreOneButton, scoreTwoButton, scoreFourButton, scoreSixButton, noBallButton, wideButton;
    private int totalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        teamOneNameTextView = findViewById(R.id.text3);
        teamTwoNameTextView = findViewById(R.id.text11);
        dateTextView = findViewById(R.id.text12);
        totalScoreTextView = findViewById(R.id.edit3);
        scoreOneButton = findViewById(R.id.btn3);
        scoreTwoButton = findViewById(R.id.btn4);
        scoreFourButton = findViewById(R.id.btn5);
        scoreSixButton = findViewById(R.id.btn6);
        noBallButton = findViewById(R.id.btn7);
        wideButton = findViewById(R.id.btn8);

        // Get the team names and date passed from the MatchSetupActivity
        Intent intent = getIntent();
        String teamOneName = intent.getStringExtra("teamOneName");
        String teamTwoName = intent.getStringExtra("teamTwoName");
        String date = intent.getStringExtra("date");

        // Set the team names and date on the screen
        teamOneNameTextView.setText(teamOneName);
        teamTwoNameTextView.setText(teamTwoName);
        dateTextView.setText(date);

        // Set total score to 0 initially
        totalScore = 0;

        scoreOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScore = totalScore + 1;
                updateScoreTextView();
            }
        });

        scoreTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScore = totalScore + 2;
                updateScoreTextView();
            }
        });

        scoreFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScore = totalScore + 4;
                updateScoreTextView();
            }
        });

        scoreSixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScore = totalScore + 6;
                updateScoreTextView();
            }
        });

        noBallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScore = totalScore + 1;
                updateScoreTextView();
            }
        });
        wideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScore = totalScore + 1;
                updateScoreTextView();
            }
        });
    }
    private void updateScoreTextView() {
        totalScoreTextView.setText(Integer.toString(totalScore));
    }
}