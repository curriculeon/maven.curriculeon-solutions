package com.github.curriculeon;

/**
 * Created by leon on 1/13/2020.
 */
public enum Classroom {
    INSTANCE;
    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        Person[] personArray = students.toArray();
        Student[] studentArray = new Student[personArray.length];
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = (Student)personArray[i];

        }
        teacher.lecture(studentArray, numberOfHours);
    }

    public void hostLecture(Long instructorId, double numberOfHours) {
        Person person = instructors.findById(instructorId);
        Instructor instructor = (Instructor)person;
        this.hostLecture(instructor, numberOfHours);
    }
}
