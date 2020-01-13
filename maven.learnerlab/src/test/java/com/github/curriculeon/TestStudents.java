package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/13/2020.
 */
public class TestStudents {
    @Test
    public void test() {
        // given
        String[] expectedStudentNames = {"Divya", "Nez", "James"};
        List<String> expectedStudentNameList = Arrays.asList(expectedStudentNames);

        // when
        Students students = Students.getInstance();


        for(Person student : students) {
            String currentName = student.getName();
            Boolean containsName = expectedStudentNameList.contains(currentName);
            // then
            Assert.assertTrue(containsName);
        }
    }
}
