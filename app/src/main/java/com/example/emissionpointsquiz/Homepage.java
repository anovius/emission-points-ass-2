package com.example.emissionpointsquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void startQuiz(View view){
        Intent next = new Intent(this, QuizActivity.class);
        startActivity(next);
    }

    public void reviseLink(View view) {
        Uri webpage = Uri.parse("https://recitewithlove.files.wordpress.com/2015/12/chapter-3-makharij-ul-huroof-with-logo.pdf");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    
}