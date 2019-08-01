package com.sigilius.android.baseballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int outsTeamA = 0;
    int scoreTeamB = 0;
    int outsTeamB = 0;
    int inning = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayRunsTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.runs_team_a);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the number of outs for Team A.
     */
    public void displayOutsTeamA(int outsTeamA) {
        TextView outView = (TextView) findViewById(R.id.outs_team_a);
        outView.setText(String.valueOf(outsTeamA));
    }

    /**
     * Adds 1 run to the score for Team A.
     */
    public void addRunForTeamA(View view) {
        scoreTeamA++;
        displayRunsTeamA(scoreTeamA);
    }

    /**
     * Adds 1 out to for Team A.
     */
    public void addOutTeamA(View view) {
        if(outsTeamA < 3) {
            outsTeamA++;
            displayOutsTeamA(outsTeamA);
        }
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayRunsTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.runs_team_b);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Displays the number of outs for Team A.
     */
    public void displayOutsTeamB(int outsTeamB) {
        TextView outView = (TextView) findViewById(R.id.outs_team_b);
        outView.setText(String.valueOf(outsTeamB));
    }

    /**
     * Adds 1 run to the score for Team A.
     */
    public void addRunForTeamB(View view) {
        scoreTeamB++;
        displayRunsTeamB(scoreTeamB);
    }

    /**
     * Adds 1 out to for Team A.
     */
    public void addOutTeamB(View view) {
        if(outsTeamB < 3) {
            outsTeamB++;
            displayOutsTeamB(outsTeamB);
        }
    }


    /**
     * Displays the game inning.
     */
    public void displayInning(int inning) {
        TextView inningView = (TextView) findViewById(R.id.inning);
        inningView.setText(String.valueOf(inning));
    }


    /**
     * Add 1 to inning
     */
    public void addInning(View view) {
        String msg = "";

        inning++;
        outsTeamA = 0;
        outsTeamB = 0;
        displayInning(inning);
        displayOutsTeamA(outsTeamA);
        displayOutsTeamB(outsTeamB);
        if (inning == 7) {
            msg="Stretch!";
            displaySeventhInning(msg);
        } else {
            msg="";
            displaySeventhInning(msg);
        }
    }

    /**
     * Display message to user
     */
    public void displaySeventhInning(String msg) {
        TextView inningView = (TextView) findViewById(R.id.seventh);
        inningView.setText(msg);
    }

    /**
     * reset scores and innings
     */
    public void reset(View view) {
        inning = 1;
        scoreTeamA = 0;
        scoreTeamB = 0;
        outsTeamA = 0;
        outsTeamB = 0;
        displayOutsTeamA(outsTeamA);
        displayRunsTeamA(scoreTeamA);
        displayOutsTeamB(outsTeamB);
        displayRunsTeamB(scoreTeamB);
        displayInning(inning);
    }


}
