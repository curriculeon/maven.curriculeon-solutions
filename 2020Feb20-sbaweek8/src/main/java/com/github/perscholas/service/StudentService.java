package com.github.perscholas.service;

import com.github.perscholas.DatabaseConnection;
import com.github.perscholas.dao.StudentDao;
import com.github.perscholas.model.CourseInterface;
import com.github.perscholas.model.Student;
import com.github.perscholas.model.StudentInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// TODO - Implement respective DAO interface
public class StudentService implements StudentDao {
    private final DatabaseConnection dbc;

    public StudentService(DatabaseConnection dbc) {
        this.dbc = dbc;
    }

    public StudentService() {
        this(DatabaseConnection.MANAGEMENT_SYSTEM);
    }

    @Override
    public List<StudentInterface> getAllStudents() {
        ResultSet resultSet = dbc.executeQuery("SELECT * FROM student");
        List<StudentInterface> list = new ArrayList<>();
        try {
            while (resultSet.next()) {
                StudentInterface student = new Student();
                student.setEmail(resultSet.getString("email"));
                student.setName(resultSet.getString("name"));
                student.setPassword(resultSet.getString("password"));
                list.add(student);
            }
        } catch (Exception e) {
            throw new Error(e);
        }
        return list;
    }

    @Override
    public StudentInterface getStudentByEmail(String studentEmail) {
        return getAllStudents()
                .stream()
                .filter(student -> student.getEmail().equals(studentEmail))
                .findFirst()
                .get();
    }

    @Override
    public Boolean validateStudent(String studentEmail, String password) {
        return getStudentByEmail(studentEmail).getPassword().equals(password);
    }


    @Override
    public void registerStudentToCourse(String studentEmail, int courseId) {
        String sqlStatement = "INSERT INTO StudentRegistration VALUES('" + studentEmail + "','" + courseId + "')";
        dbc.executeStatement(sqlStatement);
    }

    @Override
    public List<CourseInterface> getStudentCourses(String studentEmail) {
        return null;
    }
}
