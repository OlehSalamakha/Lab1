package com.example.pein.lab11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.List;

/**
 * Created by pein on 3/17/15.
 */
public class Question {
    private Dictionary<String, Integer> mVariants;
    public Question(Dictionary<String, Integer> variants) {
        mVariants = variants;
    }


    public List<String> getNameOfImage() {
        List<String> result =  Collections.list(mVariants.keys());
        return result;
    }

    public List<Integer> getPoints() {
        List<Integer> result = Collections.list(mVariants.elements());
        return result;
    }

    public Dictionary<String, Integer> getQuestion() {
        return mVariants;
    }

    public int getPoint(String key) {
        return mVariants.get(key);
    }
}
