package com.example.emissionpointsquiz;

import java.util.List;

public class Question {
    String statement;
    String[] options;
    int correctOption;
    int selectedOption;

    public boolean check(){
        return this.selectedOption == this.correctOption;
    }
}
