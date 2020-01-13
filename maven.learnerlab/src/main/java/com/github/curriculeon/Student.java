package com.github.curriculeon;

/**
 * Created by leon on 1/13/2020.
 */
public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
