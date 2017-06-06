package com.khavronsky.exercisemodel.exercise_models;


public class PowerExerciseModel extends ExerciseModel {

    private final static ExerciseType type = ExerciseType.POWER;

    private int sets;
    private int repeats;
    private int weight;

    public PowerExerciseModel() {
        super.setType(type);
    }

    public int getSets() {
        return sets;
    }

    public PowerExerciseModel setSets(final int sets) {
        this.sets = sets;
        return this;
    }

    public int getRepeats() {
        return repeats;
    }

    public PowerExerciseModel setRepeats(final int repeats) {
        this.repeats = repeats;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public PowerExerciseModel setWeight(final int weight) {
        this.weight = weight;
        return this;
    }
}
