package com.example.android.scorekeeper1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {


    // Tracks the score for Team A
    int scoreTeamA = 0;
    int scoreTeamA_In1 = 0;
    int scoreTeamA_In2 = 0;
    int scoreTeamA_In3 = 0;
    int scoreTeamA_In4 = 0;
    int scoreTeamA_In5 = 0;
    int scoreTeamA_In6 = 0;
    int scoreTeamA_In7 = 0;
    int scoreTeamA_In8 = 0;
    int scoreTeamA_In9 = 0;
    // Tracks the score for Team B
    int scoreTeamB = 0;
    int scoreTeamB_In1 = 0;
    int scoreTeamB_In2 = 0;
    int scoreTeamB_In3 = 0;
    int scoreTeamB_In4 = 0;
    int scoreTeamB_In5 = 0;
    int scoreTeamB_In6 = 0;
    int scoreTeamB_In7 = 0;
    int scoreTeamB_In8 = 0;
    int scoreTeamB_In9 = 0;
    // Tracks the Out for Team A
    int outTeamA = 0;
    // Tracks the Out for Team B
    int outTeamB = 0;
    int strikes = 0;
    int foulball =0;
    int balls = 0;
    int out = 0;
    int freeRunner = 0;
    int runner = 0;
    private ToggleButton turnSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        turnSwitch = (ToggleButton) findViewById(R.id.turnSwitch);

        //set the switch to Team A
        turnSwitch.setChecked(false);
    }



    /**
     * Increase the score for the right Team.
     */
    public void addOneToScore(View v) {

        //check the current state before we display the screen
        if (turnSwitch.isChecked()) {
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
            if (outTeamB < 3) {
                scoreTeamB_In1 = scoreTeamB;
                displayForTeamB_In1(scoreTeamB_In1);
            }
            if ((outTeamB >= 3) && (outTeamB < 6)) {
                scoreTeamB_In2 = scoreTeamB - scoreTeamB_In1;
                displayForTeamB_In2(scoreTeamB_In2);
            }
            if ((outTeamB >= 6) && (outTeamB < 9)) {
                scoreTeamB_In3 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2;
                displayForTeamB_In3(scoreTeamB_In3);
            }
            if ((outTeamB >= 9) && (outTeamB < 12)) {
                scoreTeamB_In4 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3;
                displayForTeamB_In4(scoreTeamB_In4);
            }
            if ((outTeamB >= 12) && (outTeamB < 15)) {
                scoreTeamB_In5 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4;
                displayForTeamB_In5(scoreTeamB_In5);
            }
            if ((outTeamB >= 15) && (outTeamB < 18)) {
                scoreTeamB_In6 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5;
                displayForTeamB_In6(scoreTeamB_In6);
            }
            if ((outTeamB >= 18) && (outTeamB < 21)) {
                scoreTeamB_In7 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6;
                displayForTeamB_In7(scoreTeamB_In7);
            }
            if ((outTeamB >= 21) && (outTeamB < 24)) {
                scoreTeamB_In8 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6 - scoreTeamB_In7;
                displayForTeamB_In8(scoreTeamB_In8);
            }
            if ((outTeamB >= 24) && (outTeamB < 27)) {
                scoreTeamB_In9 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6 - scoreTeamB_In7 - scoreTeamB_In8;
                displayForTeamB_In9(scoreTeamB_In9);
            }

        } else {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
            if (outTeamA < 3) {
                scoreTeamA_In1 = scoreTeamA;
                displayForTeamA_In1(scoreTeamA_In1);
            }
            if ((outTeamA >= 3) && (outTeamA < 6)) {
                scoreTeamA_In2 = scoreTeamA - scoreTeamA_In1;
                displayForTeamA_In2(scoreTeamA_In2);
            }
            if ((outTeamA >= 6) && (outTeamA < 9)) {
                scoreTeamA_In3 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2;
                displayForTeamA_In3(scoreTeamA_In3);
            }
            if ((outTeamA >= 9) && (outTeamA < 12)) {
                scoreTeamA_In4 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3;
                displayForTeamA_In4(scoreTeamA_In4);
            }
            if ((outTeamA >= 12) && (outTeamA < 15)) {
                scoreTeamA_In5 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4;
                displayForTeamA_In5(scoreTeamB_In5);
            }
            if ((outTeamA >= 15) && (outTeamA < 18)) {
                scoreTeamA_In6 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5;
                displayForTeamA_In6(scoreTeamA_In6);
            }
            if ((outTeamA >= 18) && (outTeamA < 21)) {
                scoreTeamA_In7 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6;
                displayForTeamA_In7(scoreTeamA_In7);
            }
            if ((outTeamA >= 21) && (outTeamA < 24)) {
                scoreTeamA_In8 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6 - scoreTeamA_In7;
                displayForTeamA_In8(scoreTeamA_In8);
            }
            if ((outTeamA >= 24) && (outTeamA < 27)) {
                scoreTeamA_In9 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6 - scoreTeamA_In7 - scoreTeamA_In8;
                displayForTeamA_In9(scoreTeamA_In9);
            }
                    }
        if (runner <= 0) {
            runner = 0;
            displayRunners(runner);
        }
        else {
            runner = runner - 1;
            displayRunners(runner);
        }
        if (runner == 4) {
            runner = runner - 1;
            displayRunners(runner);
        }
    }

    /**
     * Decrease the score for the right Team.
     */
    public void delOneToScore(View v) {
        if (turnSwitch.isChecked()) {
            scoreTeamB = scoreTeamB - 1;
            displayForTeamB(scoreTeamB);
            if (scoreTeamB <= 0) {
                //Show an error message as Toast
                Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                //exit this method early
                scoreTeamB = 0;
                displayForTeamB(scoreTeamB);

            }



            if (outTeamB < 3) {
                scoreTeamB_In1 = scoreTeamB;
                displayForTeamB_In1(scoreTeamB_In1);
                if (scoreTeamB_In1 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamB_In1 = 0;
                    displayForTeamB_In1(scoreTeamB_In1);

                }

            }
            if ((outTeamB >= 3) && (outTeamB < 6)) {
                scoreTeamB_In2 = scoreTeamB - scoreTeamB_In1;
                displayForTeamB_In2(scoreTeamB_In2);
                if (scoreTeamB_In2 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamB = scoreTeamB_In1;
                    scoreTeamB_In2 = 0;
                    displayForTeamB(scoreTeamB);
                    displayForTeamB_In1(scoreTeamB_In1);
                    displayForTeamB_In2(scoreTeamB_In2);

                }
            }
            if ((outTeamB >= 6) && (outTeamB < 9)) {
                scoreTeamB_In3 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2;
                displayForTeamB_In3(scoreTeamB_In3);
                if (scoreTeamB_In3 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamB_In3 = 0;
                    displayForTeamB_In3(scoreTeamB_In3);
                    scoreTeamB = scoreTeamB_In1 + scoreTeamB_In2;
                    displayForTeamB(scoreTeamB);
                    displayForTeamB_In1(scoreTeamB_In1);
                    displayForTeamB_In2(scoreTeamB_In2);
                }
            }
            if ((outTeamB >= 9) && (outTeamB < 12)) {
                scoreTeamB_In4 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3;
                displayForTeamB_In4(scoreTeamB_In4);
                if (scoreTeamB_In4 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamB_In4 = 0;
                    displayForTeamB_In4(scoreTeamB_In4);
                    scoreTeamB = scoreTeamB_In1 + scoreTeamB_In2 + scoreTeamB_In3;
                    displayForTeamB(scoreTeamB);
                    displayForTeamB_In1(scoreTeamB_In1);
                    displayForTeamB_In2(scoreTeamB_In2);
                    displayForTeamB_In3(scoreTeamB_In3);
                }
            }
            if ((outTeamB >= 12) && (outTeamB < 15)) {
                scoreTeamB_In5 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4;
                displayForTeamB_In5(scoreTeamB_In5);
                if (scoreTeamB_In5 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamB_In5 = 0;
                    displayForTeamB_In5(scoreTeamB_In5);
                    scoreTeamB = scoreTeamB_In1 + scoreTeamB_In2 + scoreTeamB_In3 + scoreTeamB_In4;
                    displayForTeamB(scoreTeamB);
                    displayForTeamB_In1(scoreTeamB_In1);
                    displayForTeamB_In2(scoreTeamB_In2);
                    displayForTeamB_In3(scoreTeamB_In3);
                    displayForTeamB_In4(scoreTeamB_In4);

                }
            }
            if ((outTeamB >= 15) && (outTeamB < 18)) {
                scoreTeamB_In6 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5;
                displayForTeamB_In6(scoreTeamB_In6);
                if (scoreTeamB_In6 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamB_In6 = 0;
                    displayForTeamB_In6(scoreTeamB_In6);
                    scoreTeamB = scoreTeamB_In1 + scoreTeamB_In2 + scoreTeamB_In3 + scoreTeamB_In4 + scoreTeamB_In5;
                    displayForTeamB(scoreTeamB);
                    displayForTeamB_In1(scoreTeamB_In1);
                    displayForTeamB_In2(scoreTeamB_In2);
                    displayForTeamB_In3(scoreTeamB_In3);
                    displayForTeamB_In4(scoreTeamB_In4);
                    displayForTeamB_In5(scoreTeamB_In5);
                }
            }
            if ((outTeamB >= 18) && (outTeamB < 21)) {
                scoreTeamB_In7 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6;
                displayForTeamB_In7(scoreTeamB_In7);
                if (scoreTeamB_In7 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamB_In7 = 0;
                    displayForTeamB_In7(scoreTeamB_In7);
                    scoreTeamB = scoreTeamB_In1 + scoreTeamB_In2 + scoreTeamB_In3 + scoreTeamB_In4 + scoreTeamB_In5 + scoreTeamB_In6;
                    displayForTeamB(scoreTeamB);
                    displayForTeamB_In1(scoreTeamB_In1);
                    displayForTeamB_In2(scoreTeamB_In2);
                    displayForTeamB_In3(scoreTeamB_In3);
                    displayForTeamB_In4(scoreTeamB_In4);
                    displayForTeamB_In5(scoreTeamB_In5);
                    displayForTeamB_In6(scoreTeamB_In6);

                }
            }
            if ((outTeamB >= 21) && (outTeamB < 24)) {
                scoreTeamB_In8 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6 - scoreTeamB_In7;
                displayForTeamB_In8(scoreTeamB_In8);
                if (scoreTeamB_In8 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamB_In8 = 0;
                    displayForTeamB_In8(scoreTeamB_In8);
                    scoreTeamB = scoreTeamB_In1 + scoreTeamB_In2 + scoreTeamB_In3 + scoreTeamB_In4 + scoreTeamB_In5 + scoreTeamB_In6 + scoreTeamB_In7;
                    displayForTeamB(scoreTeamB);
                    displayForTeamB_In1(scoreTeamB_In1);
                    displayForTeamB_In2(scoreTeamB_In2);
                    displayForTeamB_In3(scoreTeamB_In3);
                    displayForTeamB_In4(scoreTeamB_In4);
                    displayForTeamB_In5(scoreTeamB_In5);
                    displayForTeamB_In6(scoreTeamB_In6);
                    displayForTeamB_In7(scoreTeamA_In7);

                }
            }
            if ((outTeamB >= 24) && (outTeamB < 27)) {
                scoreTeamB_In9 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6 - scoreTeamB_In7 - scoreTeamB_In8;
                displayForTeamB_In9(scoreTeamB_In9);
                if (scoreTeamB_In9 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamB_In9 = 0;
                    displayForTeamB_In9(scoreTeamB_In9);
                    scoreTeamB = scoreTeamB_In1 + scoreTeamB_In2 + scoreTeamB_In3 + scoreTeamB_In4 + scoreTeamB_In5 + scoreTeamB_In6 + scoreTeamB_In7 + scoreTeamB_In8;
                    displayForTeamB(scoreTeamB);
                    displayForTeamB_In1(scoreTeamB_In1);
                    displayForTeamB_In2(scoreTeamB_In2);
                    displayForTeamB_In3(scoreTeamB_In3);
                    displayForTeamB_In4(scoreTeamB_In4);
                    displayForTeamB_In5(scoreTeamB_In5);
                    displayForTeamB_In6(scoreTeamB_In6);
                    displayForTeamB_In7(scoreTeamA_In7);
                    displayForTeamB_In8(scoreTeamB_In8);
                }
            }

        } else {
            scoreTeamA = scoreTeamA - 1;
            displayForTeamA(scoreTeamA);
            if (scoreTeamA <= 0) {
                //Show an error message as Toast
                Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                //exit this method early
                scoreTeamA = 0;
                displayForTeamA(scoreTeamA);

            }


            if (outTeamA < 3) {
                scoreTeamA_In1 = scoreTeamA;
                displayForTeamA_In1(scoreTeamA_In1);
                if (scoreTeamA_In1 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamA_In1 = 0;
                    displayForTeamA_In1(scoreTeamA_In1);

                }
            }
            if ((outTeamA >= 3) && (outTeamA < 6)) {
                scoreTeamA_In2 = scoreTeamA - scoreTeamA_In1;
                displayForTeamA_In2(scoreTeamA_In2);
                if (scoreTeamA_In2 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamA = scoreTeamA_In1;
                    scoreTeamA_In2 = 0;
                    displayForTeamA(scoreTeamA);
                    displayForTeamA_In1(scoreTeamA_In1);
                    displayForTeamA_In2(scoreTeamA_In2);

                }
            }
            if ((outTeamA >= 6) && (outTeamA < 9)) {
                scoreTeamA_In3 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2;
                displayForTeamA_In3(scoreTeamA_In3);
                if (scoreTeamA_In3 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamA_In3 = 0;
                    displayForTeamA_In3(scoreTeamA_In3);
                    scoreTeamA = scoreTeamA_In1 + scoreTeamA_In2;
                    displayForTeamA(scoreTeamA);
                    displayForTeamA_In1(scoreTeamA_In1);
                    displayForTeamA_In2(scoreTeamA_In2);

                }
            }
            if ((outTeamA >= 9) && (outTeamA < 12)) {
                scoreTeamA_In4 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3;
                displayForTeamA_In4(scoreTeamA_In4);
                if (scoreTeamA_In4 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamA_In4 = 0;
                    displayForTeamA_In4(scoreTeamA_In4);
                    scoreTeamA = scoreTeamA_In1 + scoreTeamA_In2 + scoreTeamA_In3;
                    displayForTeamA(scoreTeamA);
                    displayForTeamA_In1(scoreTeamA_In1);
                    displayForTeamA_In2(scoreTeamA_In2);
                    displayForTeamA_In3(scoreTeamA_In3);

                }
            }
            if ((outTeamA >= 12) && (outTeamA < 15)) {
                scoreTeamA_In5 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4;
                displayForTeamA_In5(scoreTeamB_In5);
                if (scoreTeamA_In5 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamA_In5 = 0;
                    displayForTeamA_In5(scoreTeamA_In5);
                    scoreTeamA = scoreTeamA_In1 + scoreTeamA_In2 + scoreTeamA_In3 + scoreTeamA_In4;
                    displayForTeamA(scoreTeamA);
                    displayForTeamA_In1(scoreTeamA_In1);
                    displayForTeamA_In2(scoreTeamA_In2);
                    displayForTeamA_In3(scoreTeamA_In3);
                    displayForTeamA_In4(scoreTeamA_In4);

                }
            }
            if ((outTeamA >= 15) && (outTeamA < 18)) {
                scoreTeamA_In6 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5;
                displayForTeamA_In6(scoreTeamA_In6);
                if (scoreTeamA_In6 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamA_In6 = 0;
                    displayForTeamA_In6(scoreTeamA_In6);
                    scoreTeamA = scoreTeamA_In1 + scoreTeamA_In2 + scoreTeamA_In3 + scoreTeamA_In4 + scoreTeamA_In5;
                    displayForTeamA(scoreTeamA);
                    displayForTeamA_In1(scoreTeamA_In1);
                    displayForTeamA_In2(scoreTeamA_In2);
                    displayForTeamA_In3(scoreTeamA_In3);
                    displayForTeamA_In4(scoreTeamA_In4);
                    displayForTeamA_In5(scoreTeamA_In5);

                }
            }
            if ((outTeamA >= 18) && (outTeamA < 21)) {
                scoreTeamA_In7 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6;
                displayForTeamA_In7(scoreTeamA_In7);
                if (scoreTeamA_In7 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamA_In7 = 0;
                    displayForTeamA_In7(scoreTeamA_In7);
                    scoreTeamA = scoreTeamA_In1 + scoreTeamA_In2 + scoreTeamA_In3 + scoreTeamA_In4 + scoreTeamA_In5 + scoreTeamA_In6;
                    displayForTeamA(scoreTeamA);
                    displayForTeamA_In1(scoreTeamA_In1);
                    displayForTeamA_In2(scoreTeamA_In2);
                    displayForTeamA_In3(scoreTeamA_In3);
                    displayForTeamA_In4(scoreTeamA_In4);
                    displayForTeamA_In5(scoreTeamA_In5);
                    displayForTeamA_In6(scoreTeamA_In6);

                }
            }
            if ((outTeamA >= 21) && (outTeamA < 24)) {
                scoreTeamA_In8 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6 - scoreTeamA_In7;
                displayForTeamA_In8(scoreTeamA_In8);
                if (scoreTeamA_In8 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamA_In8 = 0;
                    displayForTeamA_In8(scoreTeamA_In8);
                    scoreTeamA = scoreTeamA_In1 + scoreTeamA_In2 + scoreTeamA_In3 + scoreTeamA_In4 + scoreTeamA_In5 + scoreTeamA_In6 + scoreTeamA_In7;
                    displayForTeamA(scoreTeamA);
                    displayForTeamA_In1(scoreTeamA_In1);
                    displayForTeamA_In2(scoreTeamA_In2);
                    displayForTeamA_In3(scoreTeamA_In3);
                    displayForTeamA_In4(scoreTeamA_In4);
                    displayForTeamA_In5(scoreTeamA_In5);
                    displayForTeamA_In6(scoreTeamA_In6);
                    displayForTeamA_In7(scoreTeamA_In7);

                }
            }
            if ((outTeamA >= 24) && (outTeamA < 27)) {
                scoreTeamA_In9 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6 - scoreTeamA_In7 - scoreTeamA_In8;
                displayForTeamA_In9(scoreTeamA_In9);
                if (scoreTeamA_In9 <= 0) {
                    //Show an error message as Toast
                    Toast.makeText(this, "You cannot have less than 0 as Score", Toast.LENGTH_SHORT).show();
                    //exit this method early
                    scoreTeamA_In9 = 0;
                    displayForTeamA_In9(scoreTeamA_In9);
                    scoreTeamA = scoreTeamA_In1 + scoreTeamA_In2 + scoreTeamA_In3 + scoreTeamA_In4 + scoreTeamA_In5 + scoreTeamA_In6 + scoreTeamA_In7 + scoreTeamA_In8;
                    displayForTeamA(scoreTeamA);
                    displayForTeamA_In1(scoreTeamA_In1);
                    displayForTeamA_In2(scoreTeamA_In2);
                    displayForTeamA_In3(scoreTeamA_In3);
                    displayForTeamA_In4(scoreTeamA_In4);
                    displayForTeamA_In5(scoreTeamA_In5);
                    displayForTeamA_In6(scoreTeamA_In6);
                    displayForTeamA_In7(scoreTeamA_In7);
                    displayForTeamA_In8(scoreTeamA_In8);

                }
            }
        }
    }

    /**
     * Increase the score for homeruns to right Team.
     */
    public void homerun(View v) {

        strikes = 0;
        balls = 0;
        foulball = 0;
        displayStrikes(strikes);
        displayBalls(balls);
        displayFoulball(foulball);

        //check the current state before we display the screen
        if (turnSwitch.isChecked()) {
            scoreTeamB = scoreTeamB + runner + 1;
            displayForTeamB(scoreTeamB);
            if (outTeamB < 3) {
                scoreTeamB_In1 = scoreTeamB_In1 + runner + 1;
                displayForTeamB_In1(scoreTeamB_In1);
            }
            if ((outTeamB >= 3) && (outTeamB < 6)) {
                scoreTeamB_In2 = scoreTeamB_In2 + runner + 1;
                displayForTeamB_In2(scoreTeamB_In2);
            }
            if ((outTeamB >= 6) && (outTeamB < 9)) {
                scoreTeamB_In3 = scoreTeamB_In3 + runner + 1;
                displayForTeamB_In3(scoreTeamB_In3);
            }
            if ((outTeamB >= 9) && (outTeamB < 12)) {
                scoreTeamB_In4 = scoreTeamB_In4 + runner + 1;
                displayForTeamB_In4(scoreTeamB_In4);
            }
            if ((outTeamB >= 12) && (outTeamB < 15)) {
                scoreTeamB_In5 = scoreTeamB_In5 + runner + 1;
                displayForTeamB_In5(scoreTeamB_In5);
            }
            if ((outTeamB >= 15) && (outTeamB < 18)) {
                scoreTeamB_In6 = scoreTeamB_In6 + runner + 1;
                displayForTeamB_In6(scoreTeamB_In6);
            }
            if ((outTeamB >= 18) && (outTeamB < 21)) {
                scoreTeamB_In7 = scoreTeamB_In7 + runner + 1;
                displayForTeamB_In7(scoreTeamB_In7);
            }
            if ((outTeamB >= 21) && (outTeamB < 24)) {
                scoreTeamB_In8 = scoreTeamB_In8 + runner + 1;
                displayForTeamB_In8(scoreTeamB_In8);
            }
            if ((outTeamB >= 24) && (outTeamB < 27)) {
                scoreTeamB_In9 = scoreTeamB_In9 + runner + 1;
                displayForTeamB_In9(scoreTeamB_In9);
            }
        } else {
            scoreTeamA = scoreTeamA + runner + 1;
            displayForTeamA(scoreTeamA);
            if (outTeamA < 3) {
                scoreTeamA_In1 = scoreTeamA_In1 + runner + 1;
                displayForTeamA_In1(scoreTeamA_In1);
            }
            if ((outTeamA >= 3) && (outTeamA < 6)) {
                scoreTeamA_In2 = scoreTeamA_In2 + runner + 1;
                displayForTeamA_In2(scoreTeamA_In2);
            }
            if ((outTeamA >= 6) && (outTeamA < 9)) {
                scoreTeamA_In3 = scoreTeamA_In3 + runner + 1;
                displayForTeamA_In3(scoreTeamA_In3);
            }
            if ((outTeamA >= 9) && (outTeamA < 12)) {
                scoreTeamA_In4 = scoreTeamA_In4 + runner + 1;
                displayForTeamA_In4(scoreTeamA_In4);
            }
            if ((outTeamA >= 12) && (outTeamA < 15)) {
                scoreTeamA_In5 = scoreTeamA_In5 + runner + 1;
                displayForTeamA_In5(scoreTeamA_In5);
            }
            if ((outTeamA >= 15) && (outTeamA < 18)) {
                scoreTeamA_In6 = scoreTeamA_In6 + runner + 1;
                displayForTeamA_In6(scoreTeamA_In6);
            }
            if ((outTeamA >= 18) && (outTeamA <= 21)) {
                scoreTeamA_In7 = scoreTeamA_In7 + runner + 1;
                displayForTeamA_In7(scoreTeamA_In7);
            }
            if ((outTeamA >= 21) && (outTeamA < 24)) {
                scoreTeamA_In8 = scoreTeamA_In8 + runner + 1;
                displayForTeamA_In8(scoreTeamA_In8);
            }
            if ((outTeamA >= 24) && (outTeamA < 27)) {
                scoreTeamA_In9 = scoreTeamA_In9 + runner + 1;
                displayForTeamA_In9(scoreTeamA_In9);
            }
        }
        runner = 0;
        displayRunners(runner);
        freeRunner = 0;

    }

    /**
     * This method is called when the plus button is clicked for Strikes.
     */
    public void incrementStrike(View view) {

        strikes = strikes + 1;
        displayStrikes(strikes);
        if (strikes == 3) {
            if (turnSwitch.isChecked()) {
                outTeamB = outTeamB + 1;
//                displayForTeamB(scoreTeamB);
            } else {
                outTeamA = outTeamA + 1;
//                displayForTeamA(scoreTeamA);
            }
//            //Show an error message as Toast
//            Toast.makeText(this, "You cannot have more than 3 Strikes", Toast.LENGTH_SHORT).show();
//            //exit this method early
            strikes = 0;
            balls = 0;
            foulball = 0;
            out = out + 1;
            displayStrikes(strikes);
            displayFoulball(foulball);
            displayBalls(balls);
            displayOut(out);
            if (out == 3) {
                if (turnSwitch.isChecked()) {
                    turnSwitch.setChecked(false);
                } else {
                    turnSwitch.setChecked(true);
                }


//            //Show an error message as Toast
//            Toast.makeText(this, "You cannot have more than 100 coffees", Toast.LENGTH_SHORT).show();
//            //exit this method early
                out = 0;
                strikes = 0;
                foulball = 0;
                balls = 0;
                freeRunner = 0;
                runner = 0;
                displayOut(out);
                displayStrikes(strikes);
                displayBalls(balls);
                displayFoulball(foulball);
                displayRunners(runner);

            }

        }
    }

    /**
     * This method is called when the minus button is clicked for Strikes.
     */
    public void decrementStrike(View view) {
        strikes = strikes - 1;
        displayStrikes(strikes);
        if (strikes <= 0) {
            //Show an error message as Toast
            Toast.makeText(this, "You cannot have less than 0 Strikes", Toast.LENGTH_SHORT).show();
            //exit this method early
            strikes = 0;
            displayStrikes(strikes);

        }
    }

    //    /**
//     * This method is called when the plus button is clicked for Foul Ball.
//     */
    public void incrementFoulBall(View view) {

        foulball = foulball + 1;
        displayFoulball(foulball);
        if (strikes < 2) {
            strikes = strikes + 1;
            displayStrikes(strikes);
        }
//        else {
//            foulball = foulball+1;
//            displayFoulball(foulball);
//        }
    }

    //    /**
//     * This method is called when the minus button is clicked for Strikes.
//     */
    public void decrementFoulball(View view) {
        foulball = foulball - 1;
        displayFoulball(foulball);
        if (foulball <= 0) {
            //Show an error message as Toast
            Toast.makeText(this, "You cannot have less than 0 Foul Ball", Toast.LENGTH_SHORT).show();
            //exit this method early
            foulball = 0;
            displayFoulball(foulball);

        }
    }


    /**
     * This method is called when the plus button is clicked for Balls.
     */
    public void incrementBall(View view) {

        balls = balls + 1;
        displayBalls(balls);
        if (balls == 4) {
            freeRunner = freeRunner + 1;
            runner = runner + 1;
            displayRunners(runner);
            strikes = 0;
            displayStrikes(strikes);
            foulball = 0;
            displayFoulball(foulball);
            balls = 0;
            displayBalls(balls);

        }
        if (freeRunner == 4) {

            //check the current state before we display the screen
            if (turnSwitch.isChecked()) {
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);
                if (outTeamB < 3) {
                    scoreTeamB_In1 = scoreTeamB;
                    displayForTeamB_In1(scoreTeamB_In1);
                }
                if ((outTeamB >= 3) && (outTeamB < 6)) {
                    scoreTeamB_In2 = scoreTeamB - scoreTeamB_In1;
                    displayForTeamB_In2(scoreTeamB_In2);
                }
                if ((outTeamB >= 6) && (outTeamB < 9)) {
                    scoreTeamB_In3 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2;
                    displayForTeamB_In3(scoreTeamB_In3);
                }
                if ((outTeamB >= 9) && (outTeamB < 12)) {
                    scoreTeamB_In4 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3;
                    displayForTeamB_In4(scoreTeamB_In4);
                }
                if ((outTeamB >= 12) && (outTeamB < 15)) {
                    scoreTeamB_In5 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4;
                    displayForTeamB_In5(scoreTeamB_In5);
                }
                if ((outTeamB >= 15) && (outTeamB < 18)) {
                    scoreTeamB_In6 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5;
                    displayForTeamB_In6(scoreTeamB_In6);
                }
                if ((outTeamB >= 18) && (outTeamB < 21)) {
                    scoreTeamB_In7 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6;
                    displayForTeamB_In7(scoreTeamB_In7);
                }
                if ((outTeamB >= 21) && (outTeamB < 24)) {
                    scoreTeamB_In8 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6 - scoreTeamB_In7;
                    displayForTeamB_In8(scoreTeamB_In8);
                }
                if ((outTeamB >= 24) && (outTeamB < 27)) {
                    scoreTeamB_In9 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6 - scoreTeamB_In7 - scoreTeamB_In8;
                    displayForTeamB_In9(scoreTeamB_In9);
                }

            } else {
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
                if (outTeamA < 3) {
                    scoreTeamA_In1 = scoreTeamA;
                    displayForTeamA_In1(scoreTeamA_In1);
                }
                if ((outTeamA >= 3) && (outTeamA < 6)) {
                    scoreTeamA_In2 = scoreTeamA - scoreTeamA_In1;
                    displayForTeamA_In2(scoreTeamA_In2);
                }
                if ((outTeamA >= 6) && (outTeamA < 9)) {
                    scoreTeamA_In3 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2;
                    displayForTeamA_In3(scoreTeamA_In3);
                }
                if ((outTeamA >= 9) && (outTeamA < 12)) {
                    scoreTeamA_In4 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3;
                    displayForTeamA_In4(scoreTeamA_In4);
                }
                if ((outTeamA >= 12) && (outTeamA < 15)) {
                    scoreTeamA_In5 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4;
                    displayForTeamA_In5(scoreTeamB_In5);
                }
                if ((outTeamA >= 15) && (outTeamA < 18)) {
                    scoreTeamA_In6 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5;
                    displayForTeamA_In6(scoreTeamA_In6);
                }
                if ((outTeamA >= 18) && (outTeamA < 21)) {
                    scoreTeamA_In7 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6;
                    displayForTeamA_In7(scoreTeamA_In7);
                }
                if ((outTeamA >= 21) && (outTeamA < 24)) {
                    scoreTeamA_In8 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6 - scoreTeamA_In7;
                    displayForTeamA_In8(scoreTeamA_In8);
                }
                if ((outTeamA >= 24) && (outTeamA < 27)) {
                    scoreTeamA_In9 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6 - scoreTeamA_In7 - scoreTeamA_In8;
                    displayForTeamA_In9(scoreTeamA_In9);
                }

            }
            runner = runner - 1;
            freeRunner = freeRunner -1;
            displayRunners(runner);
        }
    }

    /**
     * This method is called when the minus button is clicked for Balls.
     */
    public void decrementBall(View view) {
        balls = balls - 1;
        displayBalls(balls);
        if (balls <= 0) {
            //Show an error message as Toast
            Toast.makeText(this, "You cannot have less than 0 Balls", Toast.LENGTH_SHORT).show();
            //exit this method early
            balls = 0;
            displayBalls(balls);
        }
    }

    /**
     * This method is called when the plus button is clicked for Out.
     */
    public void incrementOut(View view) {
        out = out + 1;
        runner = runner - 1;
        freeRunner = freeRunner - 1;
        displayOut(out);
        displayRunners(runner);

        if (runner <= 0) {
            runner = 0;
            displayRunners(runner);
        }

        if (turnSwitch.isChecked()) {
            outTeamB = outTeamB + 1;
        } else {
            outTeamA = outTeamA + 1;
        }

        if (out == 3) {
            out = 0;
            strikes = 0;
            foulball = 0;
            balls = 0;
            freeRunner = 0;
            runner = 0;
            displayOut(out);
            displayStrikes(strikes);
            displayFoulball(foulball);
            displayBalls(balls);
            displayRunners(runner);

            if (turnSwitch.isChecked()) {
                turnSwitch.setChecked(false);
            } else {
                turnSwitch.setChecked(true);
            }
        }

    }

    /**
     * This method is called when the minus button is clicked for Out.
     */
    public void decrementOut(View view) {
        out = out - 1;
        displayOut(out);
        if (out <= 0) {
            //Show an error message as Toast
            Toast.makeText(this, "You cannot have less than 0 Out", Toast.LENGTH_SHORT).show();
            //exit this method early
            out = 0;
            displayOut(out);
        }
    }

    /**
     * Method to calculate Free Bases.
     */
    public void freeRunner(View v) {

        freeRunner = freeRunner + 1;
        runner = runner + 1;
        displayRunners(runner);
        strikes = 0;
        displayStrikes(strikes);
        balls = 0;
        displayBalls(balls);
        foulball = 0;
        displayFoulball(foulball);

        if (freeRunner == 4) {
            freeRunner = freeRunner - 1;
            runner = runner -1;
            displayRunners(runner);

            //check the current state before we display the screen
            if (turnSwitch.isChecked()) {
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);
                if (outTeamB < 3) {
                    scoreTeamB_In1 = scoreTeamB;
                    displayForTeamB_In1(scoreTeamB_In1);
                }
                if ((outTeamB >= 3) && (outTeamB < 6)) {
                    scoreTeamB_In2 = scoreTeamB - scoreTeamB_In1;
                    displayForTeamB_In2(scoreTeamB_In2);
                }
                if ((outTeamB >= 6) && (outTeamB < 9)) {
                    scoreTeamB_In3 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2;
                    displayForTeamB_In3(scoreTeamB_In3);
                }
                if ((outTeamB >= 9) && (outTeamB < 12)) {
                    scoreTeamB_In4 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3;
                    displayForTeamB_In4(scoreTeamB_In4);
                }
                if ((outTeamB >= 12) && (outTeamB < 15)) {
                    scoreTeamB_In5 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4;
                    displayForTeamB_In5(scoreTeamB_In5);
                }
                if ((outTeamB >= 15) && (outTeamB < 18)) {
                    scoreTeamB_In6 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5;
                    displayForTeamB_In6(scoreTeamB_In6);
                }
                if ((outTeamB >= 18) && (outTeamB < 21)) {
                    scoreTeamB_In7 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6;
                    displayForTeamB_In7(scoreTeamB_In7);
                }
                if ((outTeamB >= 21) && (outTeamB < 24)) {
                    scoreTeamB_In8 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6 - scoreTeamB_In7;
                    displayForTeamB_In8(scoreTeamB_In8);
                }
                if ((outTeamB >= 24) && (outTeamB < 27)) {
                    scoreTeamB_In9 = scoreTeamB - scoreTeamB_In1 - scoreTeamB_In2 - scoreTeamB_In3 - scoreTeamB_In4 - scoreTeamB_In5 - scoreTeamB_In6 - scoreTeamB_In7 - scoreTeamB_In8;
                    displayForTeamB_In9(scoreTeamB_In9);
                }

            } else {
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
                if (outTeamA < 3) {
                    scoreTeamA_In1 = scoreTeamA;
                    displayForTeamA_In1(scoreTeamA_In1);
                }
                if ((outTeamA >= 3) && (outTeamA < 6)) {
                    scoreTeamA_In2 = scoreTeamA - scoreTeamA_In1;
                    displayForTeamA_In2(scoreTeamA_In2);
                }
                if ((outTeamA >= 6) && (outTeamA < 9)) {
                    scoreTeamA_In3 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2;
                    displayForTeamA_In3(scoreTeamA_In3);
                }
                if ((outTeamA >= 9) && (outTeamA < 12)) {
                    scoreTeamA_In4 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3;
                    displayForTeamA_In4(scoreTeamA_In4);
                }
                if ((outTeamA >= 12) && (outTeamA < 15)) {
                    scoreTeamA_In5 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4;
                    displayForTeamA_In5(scoreTeamB_In5);
                }
                if ((outTeamA >= 15) && (outTeamA < 18)) {
                    scoreTeamA_In6 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5;
                    displayForTeamA_In6(scoreTeamA_In6);
                }
                if ((outTeamA >= 18) && (outTeamA < 21)) {
                    scoreTeamA_In7 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6;
                    displayForTeamA_In7(scoreTeamA_In7);
                }
                if ((outTeamA >= 21) && (outTeamA < 24)) {
                    scoreTeamA_In8 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6 - scoreTeamA_In7;
                    displayForTeamA_In8(scoreTeamA_In8);
                }
                if ((outTeamA >= 24) && (outTeamA < 27)) {
                    scoreTeamA_In9 = scoreTeamA - scoreTeamA_In1 - scoreTeamA_In2 - scoreTeamA_In3 - scoreTeamA_In4 - scoreTeamA_In5 - scoreTeamA_In6 - scoreTeamA_In7 - scoreTeamA_In8;
                    displayForTeamA_In9(scoreTeamA_In9);
                }

            }

        }

    }


    /**
     * Method to calculate men on Bases.
     */
    public void runner(View v) {

        runner = runner + 1;
        displayRunners(runner);
        strikes = 0;
        displayStrikes(strikes);
        balls = 0;
        displayBalls(balls);
        foulball = 0;
        displayFoulball(foulball);

        if (runner == 0) {
            runner = 0;
            displayRunners(runner);
        }

    }

    /**
     * Method to RESET.
     */
    public void reset (View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamA_In1 = 0;
        displayForTeamA_In1(scoreTeamA_In1);
        scoreTeamA_In2 = 0;
        displayForTeamA_In2(scoreTeamA_In2);
        scoreTeamA_In3 = 0;
        displayForTeamA_In3(scoreTeamA_In3);
        scoreTeamA_In4 = 0;
        displayForTeamA_In4(scoreTeamA_In4);
        scoreTeamA_In5 = 0;
        displayForTeamA_In5(scoreTeamA_In5);
        scoreTeamA_In6 = 0;
        displayForTeamA_In6(scoreTeamA_In6);
        scoreTeamA_In7 = 0;
        displayForTeamA_In7(scoreTeamA_In7);
        scoreTeamA_In8 = 0;
        displayForTeamA_In8(scoreTeamA_In8);
        scoreTeamA_In9 = 0;
        displayForTeamA_In9(scoreTeamA_In9);
        // Tracks the score for Team B
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        scoreTeamB_In1 = 0;
        displayForTeamB_In1(scoreTeamB_In1);
        scoreTeamB_In2 = 0;
        displayForTeamB_In2(scoreTeamB_In2);
        scoreTeamB_In3 = 0;
        displayForTeamB_In3(scoreTeamB_In3);
        scoreTeamB_In4 = 0;
        displayForTeamB_In4(scoreTeamB_In4);
        scoreTeamB_In5 = 0;
        displayForTeamB_In5(scoreTeamB_In5);
        scoreTeamB_In6 = 0;
        displayForTeamB_In6(scoreTeamB_In6);
        scoreTeamB_In7 = 0;
        displayForTeamB_In7(scoreTeamB_In7);
        scoreTeamB_In8 = 0;
        displayForTeamB_In8(scoreTeamB_In8);
        scoreTeamB_In9 = 0;
        displayForTeamB_In9(scoreTeamB_In9);
        // Tracks the Out for Team A
        outTeamA = 0;
        // Tracks the Out for Team B
        outTeamB = 0;

        strikes = 0;
        displayStrikes(strikes);
        foulball =0;
        displayFoulball(foulball);
        balls = 0;
        displayBalls(balls);
        out = 0;
        displayOut(out);
        freeRunner = 0;
        runner = 0;
        displayRunners(runner);
        turnSwitch.setChecked(false);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the given score for INNING 1 for Team A.
     */
    public void displayForTeamA_In1(int scoreTeamA_In1) {
        TextView scoreView = (TextView) findViewById(R.id.in1a);
        scoreView.setText(String.valueOf(scoreTeamA_In1));
    }

    /**
     * Displays the given score for INNING 2 for Team A.
     */
    public void displayForTeamA_In2(int scoreTeamA_In2) {
        TextView scoreView = (TextView) findViewById(R.id.in2a);
        scoreView.setText(String.valueOf(scoreTeamA_In2));
    }

    /**
     * Displays the given score for INNING 3 for Team A.
     */
    public void displayForTeamA_In3(int scoreTeamA_In3) {
        TextView scoreView = (TextView) findViewById(R.id.in3a);
        scoreView.setText(String.valueOf(scoreTeamA_In3));
    }

    /**
     * Displays the given score for INNING 4 for Team A.
     */
    public void displayForTeamA_In4(int scoreTeamA_In4) {
        TextView scoreView = (TextView) findViewById(R.id.in4a);
        scoreView.setText(String.valueOf(scoreTeamA_In4));
    }

    /**
     * Displays the given score for INNING 5 for Team A.
     */
    public void displayForTeamA_In5(int scoreTeamA_In5) {
        TextView scoreView = (TextView) findViewById(R.id.in5a);
        scoreView.setText(String.valueOf(scoreTeamA_In5));
    }

    /**
     * Displays the given score for INNING 6 for Team A.
     */
    public void displayForTeamA_In6(int scoreTeamA_In6) {
        TextView scoreView = (TextView) findViewById(R.id.in6a);
        scoreView.setText(String.valueOf(scoreTeamA_In6));
    }

    /**
     * Displays the given score for INNING 7 for Team A.
     */
    public void displayForTeamA_In7(int scoreTeamA_In7) {
        TextView scoreView = (TextView) findViewById(R.id.in7a);
        scoreView.setText(String.valueOf(scoreTeamA_In7));
    }

    /**
     * Displays the given score for INNING 8 for Team A.
     */
    public void displayForTeamA_In8(int scoreTeamA_In8) {
        TextView scoreView = (TextView) findViewById(R.id.in8a);
        scoreView.setText(String.valueOf(scoreTeamA_In8));
    }

    /**
     * Displays the given score for INNING 9 for Team A.
     */
    public void displayForTeamA_In9(int scoreTeamA_In9) {
        TextView scoreView = (TextView) findViewById(R.id.in9a);
        scoreView.setText(String.valueOf(scoreTeamA_In9));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Displays the given score for INNING 1 for Team B.
     */
    public void displayForTeamB_In1(int scoreTeamB_In1) {
        TextView scoreView = (TextView) findViewById(R.id.in1b);
        scoreView.setText(String.valueOf(scoreTeamB_In1));
    }

    /**
     * Displays the given score for INNING 2 for Team B.
     */
    public void displayForTeamB_In2(int scoreTeamB_In2) {
        TextView scoreView = (TextView) findViewById(R.id.in2b);
        scoreView.setText(String.valueOf(scoreTeamB_In2));
    }

    /**
     * Displays the given score for INNING 3 for Team B.
     */
    public void displayForTeamB_In3(int scoreTeamB_In3) {
        TextView scoreView = (TextView) findViewById(R.id.in3b);
        scoreView.setText(String.valueOf(scoreTeamB_In3));
    }

    /**
     * Displays the given score for INNING 4 for Team B.
     */
    public void displayForTeamB_In4(int scoreTeamB_In4) {
        TextView scoreView = (TextView) findViewById(R.id.in4b);
        scoreView.setText(String.valueOf(scoreTeamB_In4));
    }

    /**
     * Displays the given score for INNING 5 for Team B.
     */
    public void displayForTeamB_In5(int scoreTeamB_In5) {
        TextView scoreView = (TextView) findViewById(R.id.in5b);
        scoreView.setText(String.valueOf(scoreTeamB_In5));
    }

    /**
     * Displays the given score for INNING 6 for Team B.
     */
    public void displayForTeamB_In6(int scoreTeamB_In6) {
        TextView scoreView = (TextView) findViewById(R.id.in6b);
        scoreView.setText(String.valueOf(scoreTeamB_In6));
    }

    /**
     * Displays the given score for INNING 7 for Team B.
     */
    public void displayForTeamB_In7(int scoreTeamA_In7) {
        TextView scoreView = (TextView) findViewById(R.id.in7b);
        scoreView.setText(String.valueOf(scoreTeamA_In7));
    }

    /**
     * Displays the given score for INNING 8 for Team B.
     */
    public void displayForTeamB_In8(int scoreTeamB_In8) {
        TextView scoreView = (TextView) findViewById(R.id.in8b);
        scoreView.setText(String.valueOf(scoreTeamB_In8));
    }

    /**
     * Displays the given score for INNING 9 for Team B.
     */
    public void displayForTeamB_In9(int scoreTeamB_In9) {
        TextView scoreView = (TextView) findViewById(R.id.in9b);
        scoreView.setText(String.valueOf(scoreTeamB_In9));
    }

    /**
     * Displays the given Strikes.
     */
    public void displayStrikes(int strikes) {
        TextView strikeView = (TextView) findViewById(R.id.strike_number);
        strikeView.setText(String.valueOf(strikes));
    }

    /**
     * Displays the given Foulballs.
     */
    public void displayFoulball(int foulball) {
        TextView foulballView = (TextView) findViewById(R.id.foulball_number);
        foulballView.setText(String.valueOf(foulball));
    }

    /**
     * Displays the given Balls.
     */
    public void displayBalls(int balls) {
        TextView ballView = (TextView) findViewById(R.id.ball_number);
        ballView.setText(String.valueOf(balls));
    }

    /**
     * Displays the given Out.
     */
    public void displayOut(int out) {
        TextView outView = (TextView) findViewById(R.id.out_number);
        outView.setText(String.valueOf(out));

    }

    /**
     * Displays the given Runners.
     */
    public void displayRunners(int runner) {
        TextView runnerView = (TextView) findViewById(R.id.man_on_diamond);
        runnerView.setText(String.valueOf(runner));

    }


}
