package com.example.pein.lab11;

import android.util.Log;

import java.util.LinkedList;
import java.util.List;


public class Question {
    private List<Integer> mAnswers = new LinkedList<Integer>();
    private List<String> mImages = new LinkedList<String>();
    private int mAnswer = -1;
    private int mIndexOfAnswer = -1;
    public Question(int a1, int a2, int a3, int a4) {
        mAnswer = -1;
        mAnswers.clear();
        mAnswers.add(a1);
        mAnswers.add(a2);
        mAnswers.add(a3);
        mAnswers.add(a4);

    }

    public Question(List<Integer> a) {
        mAnswer = -1;
        mAnswers.clear();
        mAnswers.addAll(a);
    }

    public int getAnswer() {
        Log.d("Quest", "Get answer: " + Integer.toString(mAnswer));
        return mAnswer;
    }

    public void setAnswer(int index) {
        mAnswer = mAnswers.get(index);
        mIndexOfAnswer = index;
    }


}
