package com.khavronsky.exercisemodel;

import com.khavronsky.exercisemodel.exercise_models.ExerciseModel;
import com.khavronsky.exercisemodel.exercise_models.PowerExerciseModel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MODEL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExerciseModel exerciseModel = new PowerExerciseModel();
        exerciseModel.getTitle();
    }

    void createTwoExercises() {
        ExerciseModel firstExercise = new PowerExerciseModel();
        firstExercise
                .setTitle("first")
                .setCustomExercise(true);
        ((PowerExerciseModel) firstExercise)
                .setSets(3)
                .setRepeats(15)
                .setWeight(50000);


    }

    void printModel(ExerciseModel model){
        Log.d(TAG, "printModel: " + model.getTitle());
        Log.d(TAG, "printModel: " + model.isCustomExercise());
        Log.d(TAG, "printModel: " + model.getType());
        Log.d(TAG, "printModel: " + model.getTitle());
        Log.d(TAG, "printModel: " + model.getTitle());
        Log.d(TAG, "printModel: " + model.getTitle());
    }
}
