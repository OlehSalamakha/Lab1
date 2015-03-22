package com.example.pein.lab11;

import android.util.Log;
import android.widget.Toast;

import java.util.Dictionary;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pein on 3/17/15.
 */

//mQuestions.add(new Question(4,8,2,10));
//        mQuestions.add(new Question(10,8,2,4));
//        mQuestions.add(new Question(10,8,6,2));
//        mQuestions.add(new Question(10,8,2,6));


public class Model {
    private List<Question> mQuestions = new LinkedList<Question>();
    private int mCurrentQuestion = 0;
    public Model(List<Question> questions) {

        mQuestions.add(new Question(4,8,2,10));
        mQuestions.add(new Question(10,8,2,4));
        mQuestions.add(new Question(10,8,6,2));
        mQuestions.add(new Question(10,8,2,6));
        mQuestions.clear();
        mQuestions.addAll(questions);
        System.out.println("size: " + mQuestions.size());
    }

    public Model() {
        mQuestions.add(new Question(4,8,2,10));
        mQuestions.add(new Question(10,8,2,4));
        mQuestions.add(new Question(10,8,6,2));
        mQuestions.add(new Question(10,8,2,6));

        //mCurrentQuestion = 0;

    }

    public List<Question> getQuestions() {
        return mQuestions;
    }

    public Question getQuestion(int index) {
        return mQuestions.get(index);
    }

    public Question getQuestion() {
        Log.d("Act", "getQuestion()");
        Question q = mQuestions.get(mCurrentQuestion);
        if (mCurrentQuestion < mQuestions.size()) {

            mCurrentQuestion+=1;
        }
        return q;

    }

    public void setAnswer(int index) {
        Log.d("q", "setAnswer for quest: " + Integer.toString(mCurrentQuestion) + " answer is : " + Integer.toString(index));
        mQuestions.get(mCurrentQuestion).setAnswer(index);
    }

    public void setAnswer(int indexOfAnswer, int indexQuestion) {
        mQuestions.get(indexQuestion).setAnswer(indexOfAnswer);
    }

    public int getSummOfAnswer() {
        int result = 0;
        for (int i=0; i<mQuestions.size(); i++) {
            System.out.println(mQuestions.get(i).getAnswer());
            result += mQuestions.get(i).getAnswer();
        }
        return result;
    }

    public int getCurrentIndex() {
        return mCurrentQuestion;
    }


}