package com.github.perscholas.dao;

import com.github.perscholas.model.CourseInterface;
import com.github.perscholas.model.StudentInterface;

import java.util.List;

/**
 * Created by leon on 2/20/2020.
 */
public interface StudentRegistrationDao {
    List<CourseInterface> getAllCourses(String email);
    List<StudentInterface> getAllStudents(Integer id);
}
