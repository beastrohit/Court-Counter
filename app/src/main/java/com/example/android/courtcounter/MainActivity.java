package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_team_a = 0;
    int score_team_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add_one_for_team_a(View view) {
        score_team_a = score_team_a + 1;
        displayForTeamA(score_team_a);
    }

    public void add_two_for_team_a(View view) {
        score_team_a = score_team_a + 2;
        displayForTeamA(score_team_a);
    }

    public void add_three_for_team_a(View view) {
        score_team_a = score_team_a + 3;
        displayForTeamA(score_team_a);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add_one_for_team_b(View view) {
        score_team_b = score_team_b + 1;
        displayForTeamB(score_team_b);
    }

    public void add_two_for_team_b(View view) {
        score_team_b = score_team_b + 2;
        displayForTeamB(score_team_b);
    }

    public void add_three_for_team_b(View view) {
        score_team_b = score_team_b + 3;
        displayForTeamB(score_team_b);
    }

    public void reset_button(View view) {
        score_team_a = 0;
        score_team_b = 0;
        displayForTeamA(score_team_a);
        displayForTeamB(score_team_b);
    }
}