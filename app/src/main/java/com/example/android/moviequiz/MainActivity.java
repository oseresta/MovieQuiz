package com.example.android.moviequiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showResults(View view){
        int score = 0;
        score = score + getScore1() + getScore2() + getScore3() + getScore4() + getScore5();
        String resultText = "";
        if (score == 5) {
            resultText = "Congratulations, 5 out of 5 Correct";
        } else {
            resultText = score + " out of 5 Correct, Try Again";
        }

        Toast toast = Toast.makeText(this, resultText, Toast.LENGTH_LONG);
        toast.show();
    }

    private int getScore1(){
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        TextView q1TextView = (TextView) findViewById(R.id.q1TextView);
        if (radioGroup1.getCheckedRadioButtonId() == R.id.radioGrp1Btn1){
            q1TextView.setBackgroundColor(Color.WHITE);
            return 1;
        } else {
            q1TextView.setBackgroundColor(Color.RED);
            return 0;
        }
    }

    private int getScore2(){
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        TextView q2TextView = (TextView) findViewById(R.id.q2TextView);
        if (radioGroup2.getCheckedRadioButtonId() == R.id.radioGrp2Btn1){
            q2TextView.setBackgroundColor(Color.WHITE);
            return 1;
        } else {
            q2TextView.setBackgroundColor(Color.RED);
            return 0;
        }
    }

    private int getScore3(){
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        TextView q3TextView = (TextView) findViewById(R.id.q3TextView);
        if (radioGroup3.getCheckedRadioButtonId() == R.id.radioGrp3Btn2){
            q3TextView.setBackgroundColor(Color.WHITE);
            return 1;
        } else {
            q3TextView.setBackgroundColor(Color.RED);
            return 0;
        }
    }

    private int getScore4(){
        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);
        TextView q4TextView = (TextView) findViewById(R.id.q4TextView);
        if (radioGroup4.getCheckedRadioButtonId() == R.id.radioGrp4Btn2){
            q4TextView.setBackgroundColor(Color.WHITE);
            return 1;
        } else {
            q4TextView.setBackgroundColor(Color.RED);
            return 0;
        }
    }

    private int getScore5(){
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radioGroup5);
        TextView q5TextView = (TextView) findViewById(R.id.q5TextView);
        if (radioGroup5.getCheckedRadioButtonId() == R.id.radioGrp5Btn1){
            q5TextView.setBackgroundColor(Color.WHITE);
            return 1;
        } else {
            q5TextView.setBackgroundColor(Color.RED);
            return 0;
        }
    }
}
