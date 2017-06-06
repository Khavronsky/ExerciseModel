package com.khavronsky.exercisemodel.exercise_models;


public class ModelOfExercisePerformance {
    private ExerciseModel mExercise;
    private Long mDate;
    private Long mDuration;
    private String mNote;

    public ModelOfExercisePerformance(final ExerciseModel exercise) {
        mExercise = exercise;
    }

    public ExerciseModel getExercise() {
        return mExercise;
    }

    public Long getDate() {
        return mDate;
    }

    public ModelOfExercisePerformance setDate(final Long date) {
        mDate = date;
        return this;
    }

    public Long getDuration() {
        return mDuration;
    }

    public ModelOfExercisePerformance setDuration(final Long duration) {
        mDuration = duration;
        return this;
    }

    public String getNote() {
        return mNote;
    }

    public ModelOfExercisePerformance setNote(final String note) {
        mNote = note;
        return this;
    }
}
