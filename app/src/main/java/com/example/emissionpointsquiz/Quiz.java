package com.example.emissionpointsquiz;

import java.io.Serializable;
import java.util.List;

public class Quiz implements Serializable {
    Question[] questions;
    int correctCount;
    int wrongCount;

    Quiz(){
        correctCount = 0;
        wrongCount = 0;
        questions = new Question[10];

        for(int i=0; i<10; i++)
            questions[i] = new Question();

        questions[0].statement = "What are غ خ ?";
        questions[0].options = new String[]{
          "Lahatiyah",
          "Shajariyah-Haafiyah",
          "Halqiyah",
          "Tarfiyah"
        };
        questions[0].correctOption = 2;

        questions[1].statement = "What is ن ?";
        questions[1].options = new String[]{
                "Lahatiyah",
                "Shajariyah-Haafiyah",
                "Halqiyah",
                "Tarfiyah"
        };
        questions[1].correctOption = 3;

        questions[2].statement = "What are ج ش ی ?";
        questions[2].options = new String[]{
                "Lahatiyah",
                "Shajariyah-Haafiyah",
                "Halqiyah",
                "Tarfiyah"
        };
        questions[2].correctOption = 1;

        questions[3].statement = "From where ف comes ?";
        questions[3].options = new String[]{
                "Tip of the two upper jaw teeth touches the inner part of the lower lip",
                "Inner part of the both lips touch each other",
                "Outer part of both lips touch each other",
                "Rounding both lips and not closing the mouth"
        };
        questions[3].correctOption = 0;

        questions[4].statement = "From where م comes ?";
        questions[4].options = new String[]{
                "Tip of the two upper jaw teeth touches the inner part of the lower lip",
                "Inner part of the both lips touch each other",
                "Outer part of both lips touch each other",
                "Rounding both lips and not closing the mouth"
        };
        questions[4].correctOption = 2;

        questions[5].statement = "From where ب comes ?";
        questions[5].options = new String[]{
                "Tip of the two upper jaw teeth touches the inner part of the lower lip",
                "Inner part of the both lips touch each other",
                "Outer part of both lips touch each other",
                "Rounding both lips and not closing the mouth"
        };
        questions[5].correctOption = 1;

        questions[6].statement = "What are ت د ط ?";
        questions[6].options = new String[]{
                "Nit-eeyah",
                "Lisaveyah",
                "Tarfiyah",
                "Lahatiyahh"
        };
        questions[6].correctOption = 0;

        questions[7].statement = "What are ظ ذ ث ?";
        questions[7].options = new String[]{
                "Nit-eeyah",
                "Lisaveyah",
                "Tarfiyah",
                "Lahatiyahh"
        };
        questions[7].correctOption = 1;

        questions[8].statement = "What are ص ز س ?";
        questions[8].options = new String[]{
                "Nit-eeyah",
                "Lisaveyah",
                "Tarfiyah",
                "Lahatiyahh"
        };
        questions[8].correctOption = 1;

        questions[9].statement = "What are م ن ?";
        questions[9].options = new String[]{
                "Nit-eeyah",
                "Lisaveyah",
                "Ghunna",
                "Lahatiyahh"
        };
        questions[9].correctOption = 2;
    }

    public void check(int index){
        if(questions[index].check()) correctCount++;
        else wrongCount++;
    }
}
