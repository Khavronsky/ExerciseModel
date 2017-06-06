package com.khavronsky.exercisemodel.exercise_models;


public abstract class ExerciseModel {

    enum ExerciseType {
        CARDIO,
        POWER
    }

    private String title;

    private ExerciseType type;

    private boolean customExercise;

    public ExerciseModel setTitle(final String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    void setType(ExerciseType type) {
        this.type = type;
    }

    public ExerciseType getType() {
        return type;
    }

    public ExerciseModel setCustomExercise(final boolean customExercise) {
        this.customExercise = customExercise;
        return this;
    }

    public boolean isCustomExercise() {
        return customExercise;
    }
}
