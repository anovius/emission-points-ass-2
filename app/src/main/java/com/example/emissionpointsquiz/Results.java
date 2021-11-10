package com.example.emissionpointsquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    TextView res;
    Quiz quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = getIntent();
        quiz = (Quiz) intent.getExtras().getSerializable("quiz");

        res = findViewById(R.id.results);

        res.setText(""+quiz.correctCount+"/10");

        LinearLayout layout = findViewById(R.id.questions);



        for(int i=0; i<10; i++){
            TextView txtView = new TextView(this);
            txtView.setText(quiz.questions[i].statement);
            txtView.setTextSize(20);
            layout.addView(txtView);

            TextView txtView2 = new TextView(this);
            txtView2.setText("Your Option: "+quiz.questions[i].options[quiz.questions[i].selectedOption]);
            txtView2.setTextSize(16);
            if(quiz.questions[i].check())
                txtView2.setTextColor(Color.parseColor("#17b978"));
            else
                txtView2.setTextColor(Color.parseColor("#f85959"));
            layout.addView(txtView2);

            TextView txtView3 = new TextView(this);
            txtView3.setText("Correct Option: "+quiz.questions[i].options[quiz.questions[i].correctOption]);
            txtView3.setTextSize(16);
            txtView3.setTextColor(Color.parseColor("#17b978"));
            layout.addView(txtView3);
        }
    }

    public void shareData(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "My Score: " +quiz.correctCount+"/10");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}