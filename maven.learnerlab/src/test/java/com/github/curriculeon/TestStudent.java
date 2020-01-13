package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/13/2020.
 */
public class TestStudent {
    @Test
    public void testImplementation() {
        Student student = new Student(0L, "");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(0L, "");
        Assert.assertTrue(student instanceof Person);
    }


    @Test
    public void testLearn() {
        // given
        Student student = new Student(0L, "");
        Double preStudyTime = student.getTotalStudyTime();
        Double numberOfHoursToLearn = 10.0;
        Double expectedStudyTime = preStudyTime + numberOfHoursToLearn;

        // when
        student.learn(numberOfHoursToLearn);

        // then
        Double actualStudyTime = student.getTotalStudyTime();
        Assert.assertEquals(expectedStudyTime, actualStudyTime, 0);
    }
}
