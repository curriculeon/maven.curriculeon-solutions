package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/13/2020.
 */
public class TestInstructors {
    @Test
    public void test() {
        // given
        String[] instructorNames = {"Leon", "Christopher", "Hunter"};
        List<String> instructorNameList = Arrays.asList(instructorNames);

        // when
        Instructors instructors = Instructors.getInstance();
        for (Person instructor : instructors) {
            String instructorName = instructor.getName();
            Boolean containsName = instructorNameList.contains(instructorName);
            Assert.assertTrue(containsName);
        }
    }
}
