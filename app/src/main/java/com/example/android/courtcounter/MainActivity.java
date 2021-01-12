package com.example.android.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA = 0,scoreB = 0;
    public void showResult(View view){
        if(scoreB>scoreA){
            displayResult("Team B is the Winner");
        }
        else if(scoreA>scoreB){
            displayResult("Team A is the Winner");
        }
        else{
            displayResult("It\'s a Tie");
        }
    }
    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayResult("Result");
        display(scoreA);
        display1(scoreB);
    }
    public void add3A(View view){
        scoreA=scoreA+3;
        display(scoreA);
    }
    public void add2A(View view){
        scoreA=scoreA+2;
        display(scoreA);
    }
    public void add1A(View view){
        scoreA=scoreA+1;
        display(scoreA);
    }
    public void add3B(View view){
        scoreB=scoreB+3;
        display1(scoreB);
    }
    public void add2B(View view){
        scoreB=scoreB+2;
        display1(scoreB);
    }
    public void add1B(View view){
        scoreB=scoreB+1;
        display1(scoreB);
    }
    private void display(int num){
        TextView score = (TextView) findViewById(R.id.score_counterA);
        score.setText(String.valueOf(""+num));
    }
    private void display1(int num){
        TextView score = (TextView) findViewById(R.id.score_counterB);
        score.setText(String.valueOf(""+num));
    }
    private void displayResult(String s){
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(s));
    }
}