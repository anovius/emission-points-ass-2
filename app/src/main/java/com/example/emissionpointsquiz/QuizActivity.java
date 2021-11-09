package com.example.emissionpointsquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    Quiz quiz;
    int currentQuestion;

    TextView stat;
    RadioButton o1;
    RadioButton o2;
    RadioButton o3;
    RadioButton o4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        currentQuestion = 0;

        quiz = new Quiz();

        stat = findViewById(R.id.statement);
        o1 = findViewById(R.id.option1);
        o2 = findViewById(R.id.option2);
        o3 = findViewById(R.id.option3);
        o4 = findViewById(R.id.option4);

        generateQuestion();
    }

    void generateQuestion(){
        stat.setText(quiz.questions[currentQuestion].statement);
        o1.setText(quiz.questions[currentQuestion].options[0]);
        o2.setText(quiz.questions[currentQuestion].options[1]);
        o3.setText(quiz.questions[currentQuestion].options[2]);
        o4.setText(quiz.questions[currentQuestion].options[3]);

        currentQuestion++;
    }

    void checkQuestion(){
        RadioGroup options = findViewById(R.id.optionsGroup);
        int selectedId = options.getCheckedRadioButtonId();

        switch (selectedId){
            case R.id.option1:
                quiz.questions[currentQuestion-1].selectedOption = 0;
                break;
            case R.id.option2:
                quiz.questions[currentQuestion-1].selectedOption = 1;
                break;
            case R.id.option3:
                quiz.questions[currentQuestion-1].selectedOption = 2;
                break;
            case R.id.option4:
                quiz.questions[currentQuestion-1].selectedOption = 3;
                break;
        }

        quiz.check(currentQuestion - 1);
    }

    public void nextQuestion(View view){
        if(currentQuestion <10){
            generateQuestion();
            checkQuestion();
             if(currentQuestion == 10) {
                Button btn = findViewById(R.id.nextBtn);
                btn.setText("Finish");
            }
        }
        else{
            Intent next = new Intent(this, Results.class);
            next.putExtra("quiz", quiz);
            startActivity(next);
        }
    }
}