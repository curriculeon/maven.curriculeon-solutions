package com.github.curriculeon;

/**
 * Created by leon on 1/13/2020.
 */
public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    public Instructors() {
        String[] instructorNames = {"Leon", "Christopher", "Hunter"};
        for (Integer id = 0; id < instructorNames.length; id++) {
            String instructorName = instructorNames[id];
            Instructor instructor = new Instructor(id.longValue(), instructorName);
            super.add(instructor);
        }
    }

    @Override
    public Instructor[] toArray() {
        return super.personList.toArray(new Instructor[0]);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
