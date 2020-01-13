package com.github.curriculeon;

/**
 * Created by leon on 1/13/2020.
 */
public enum Educator implements Teacher {
    LEON,
    CHRISTOPHER,
    HUNTER;

    private final Instructor instructor;
    private double timeWorked;

    Educator() {
        Integer id = this.ordinal();
        String name = this.name();
        this.instructor = new Instructor(id.longValue(), name) {
            @Override
            public void teach(Learner learner, double numberOfHours) {
                Educator.this.timeWorked+= numberOfHours;
                super.teach(learner, numberOfHours);
            }
        };
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }
}
