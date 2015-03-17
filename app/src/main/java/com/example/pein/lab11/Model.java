package com.example.pein.lab11;

import java.util.Dictionary;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pein on 3/17/15.
 */
public class Model {
    List<Question> mQuestions;
    List<Integer> mResult;

    public Model(List<Question> questions) {
        mQuestions = questions;
        mResult = new LinkedList<Integer>();
    }

    public Model() {
        mQuestions = new LinkedList<Question>();
        mResult = new LinkedList<Integer>();
    }

    public void addQuestion(Question q) {
        mQuestions.add(q);
    }

    public void addQuestions(List<Question> q) {
        mQuestions.addAll(q);
    }

    public void setAnswer(int index, String key) {
        mResult.add(index, mQuestions.get(index).getPoint(key));
    }

    public Question getQuestion(int index) {
        return mQuestions.get(index);
    }


    public int getAnswer(int index) {
        return mResult.get(index);
    }
}
