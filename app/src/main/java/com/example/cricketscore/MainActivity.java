package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText teamOneNameEditText, teamTwoNameEditText, dateEditText;
    private Button startScoringButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamOneNameEditText = findViewById(R.id.edit1);
        teamTwoNameEditText = findViewById(R.id.edit2);
        dateEditText = findViewById(R.id.date);
        startScoringButton = findViewById(R.id.btn);

        // Set a click listener on the start scoring button

        startScoringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the team names and date entered by the user
                String teamOneName = teamOneNameEditText.getText().toString();
                String teamTwoName = teamTwoNameEditText.getText().toString();
                String date = dateEditText.getText().toString();

                // Create an intent to start the ScoringActivity
                Intent intent = new Intent(MainActivity.this, Score.class);

                // Pass the team names and date to the ScoringActivity
                intent.putExtra("teamOneName", teamOneName);
                intent.putExtra("teamTwoName", teamTwoName);
                intent.putExtra("date", date);

                startActivity(intent);
            }
        });

    }
}