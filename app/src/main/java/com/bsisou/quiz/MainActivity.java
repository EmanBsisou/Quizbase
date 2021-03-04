package com.bsisou.quiz;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Declare constants here


    // TODO: Declare member variables here:
    Button trueButton;
    Button falseButton;
    TextView scoreTextView;
    TextView questionTextView;
    ProgressBar progressBar;


    // TODO: to create question bank


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // In API 26 'casting' is no longer needed.
        // For API 25 and lower: trueButton = (Button) findViewById(R.id.true_button);
        // For API 26 and higher can use: trueButton = findViewById(R.id.true_button);
        trueButton = findViewById(R.id.true_button);
        falseButton = findViewById(R.id.false_button);
        questionTextView = findViewById(R.id.question_text_view);
        scoreTextView = findViewById(R.id.score);
        progressBar = findViewById(R.id.progress_bar);

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Quiz", "True button pressed");//just to test that listener is working
                Toast tmsg = Toast.makeText(getApplicationContext(),"True clicked!", Toast.LENGTH_SHORT);
                tmsg.show();
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Quiz", "False button pressed");//just to test that listener is working

            }
        });




    }
}
