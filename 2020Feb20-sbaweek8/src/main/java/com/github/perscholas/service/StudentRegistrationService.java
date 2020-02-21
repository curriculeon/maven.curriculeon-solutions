package com.github.perscholas.service;

import com.github.perscholas.DatabaseConnection;
import com.github.perscholas.dao.CourseDao;
import com.github.perscholas.dao.StudentDao;
import com.github.perscholas.dao.StudentRegistrationDao;
import com.github.perscholas.model.CourseInterface;
import com.github.perscholas.model.StudentInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/20/2020.
 */
public class StudentRegistrationService implements StudentRegistrationDao {
    private DatabaseConnection dbc;

    public StudentRegistrationService(DatabaseConnection dbc) {
        this.dbc = dbc;
    }

    public StudentRegistrationService() {
        this(DatabaseConnection.MANAGEMENT_SYSTEM);
    }

    @Override
    public List<CourseInterface> getAllCourses(String email) {
        ResultSet result = dbc.executeQuery("SELECT * FROM studentregistration WHERE `email` = '" + email + "'");
        CourseDao courseService = new CourseService();
        List<CourseInterface> list = new ArrayList<>();
        try {
            while (result.next()) {
                int id = result.getInt("id");
                list.add(courseService
                        .getAllCourses()
                        .stream()
                        .filter(crs -> crs.getId().equals(id))
                        .findFirst()
                        .get());
            }
        } catch (SQLException e) {
            throw new Error(e);
        }
        return list;
    }

    @Override
    public List<StudentInterface> getAllStudents(Integer id) {
        ResultSet result = dbc.executeQuery("SELECT * FROM studentregistration WHERE `id` = '" + id + "'");
        StudentDao studentService = new StudentService();
        List<StudentInterface> list = new ArrayList<>();
        try {
            while (result.next()) {
                String email = result.getString("email");
                list.add(studentService
                        .getAllStudents()
                        .stream()
                        .filter(student -> student.getEmail().equals(email))
                        .findFirst()
                        .get());
            }
        } catch (SQLException e) {
            throw new Error(e);
        }
        return list;
    }
}
