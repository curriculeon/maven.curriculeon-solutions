package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/13/2020.
 */
public class TestEducator {
    @Test
    public void testImplementation() {
        Educator educator = Educator.LEON;
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void testTeach() {
        Teacher instructor = Educator.LEON;
        Learner student = new Student(0L, "");
        Double numberOfHoursToTeach = 10.0;
        Double expectedNumberOfHoursLearned = student.getTotalStudyTime() + numberOfHoursToTeach;

        // when
        instructor.teach(student, numberOfHoursToTeach);
        Double actualNumberOfHoursLearned = student.getTotalStudyTime();

        // then
        Assert.assertEquals(expectedNumberOfHoursLearned, actualNumberOfHoursLearned, 0);
    }
}
