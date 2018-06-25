package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkRadioButtonQuestion1IsClicked(){
        RadioButton answer1 = findViewById(R.id.Q1a);
        boolean q1a = answer1.isChecked();

        RadioButton answer2 = findViewById(R.id.Q1b);
        boolean q1b = answer2.isChecked();

        RadioButton answer3 = findViewById(R.id.Q1c);
        boolean q1c = answer3.isChecked();

        RadioButton answer4 = findViewById(R.id.Q1d);
        boolean q1d = answer4.isChecked();

        if(q1c){
            score1 = 5;
        }
        else if(q1b || q1a || q1d){
            score1 = 0;
        }

    }

    public void checkRadioButtonQuestion2IsClicked(){
        RadioButton answer1 = findViewById(R.id.Q2a);
        boolean q2a = answer1.isChecked();

        RadioButton answer2 = findViewById(R.id.Q2b);
        boolean q2b = answer2.isChecked();

        RadioButton answer3 = findViewById(R.id.Q2c);
        boolean q2c = answer3.isChecked();

        RadioButton answer4 = findViewById(R.id.Q2d);
        boolean q2d = answer4.isChecked();

        if(q2c){
            score2 = 5;
        }
        else if(q2b || q2a || q2d){
            score2 = 0;
        }

    }

    public void checkRadioButtonQuestion3IsClicked(){
        RadioButton answer1 = findViewById(R.id.Q3a);
        boolean q3a = answer1.isChecked();

        RadioButton answer2 = findViewById(R.id.Q3b);
        boolean q3b = answer2.isChecked();

        RadioButton answer3 = findViewById(R.id.Q3c);
        boolean q3c = answer3.isChecked();

        RadioButton answer4 = findViewById(R.id.Q3d);
        boolean q3d = answer4.isChecked();

        if(q3d){
            score3 = 5;
        }
        else if(q3b || q3a || q3c){
            score3 = 0;
        }

    }

    public void checkRadioButtonQuestion4IsClicked(){
        RadioButton answer1 = findViewById(R.id.Q4a);
        boolean q4a = answer1.isChecked();

        RadioButton answer2 = findViewById(R.id.Q4b);
        boolean q4b = answer2.isChecked();

        RadioButton answer3 = findViewById(R.id.Q4c);
        boolean q4c = answer3.isChecked();

        RadioButton answer4 = findViewById(R.id.Q4d);
        boolean q4d = answer4.isChecked();

        if(q4a){
            score4 = 5;
        }
        else if(q4b || q4d || q4c){
            score4 = 0;
        }

    }

    public void submit(View view){
        checkRadioButtonQuestion4IsClicked();
        checkRadioButtonQuestion1IsClicked();
        checkRadioButtonQuestion2IsClicked();
        checkRadioButtonQuestion3IsClicked();

        int sum = score1 + score2 + score3 + score4;
        if(sum>10){
            Toast toast = Toast.makeText(getBaseContext(), "Congrats! You Passed", Toast.LENGTH_LONG);
            toast.show();
        }else {
            Toast toast = Toast.makeText(getBaseContext(), "You didn't make it", Toast.LENGTH_LONG);
            toast.show();
        }
        displayFinalScore("Final Score:  " + sum + " out of 20");
    }

    public void displayFinalScore(String finalscore){
        TextView textView = findViewById(R.id.finalScore);
        textView.setText(finalscore);
    }
}
