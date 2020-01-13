package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 1/13/2020.
 */
public enum Classroom {
    INSTANCE;
    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(Long instructorId, double numberOfHours) {
        Person person = instructors.findById(instructorId);
        Instructor instructor = (Instructor)person;
        this.hostLecture(instructor, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for(Student student : students) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }
}
