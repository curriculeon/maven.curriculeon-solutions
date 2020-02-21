package com.github.perscholas.service;

import com.github.perscholas.DatabaseConnection;
import com.github.perscholas.dao.CourseDao;
import com.github.perscholas.model.Course;
import com.github.perscholas.model.CourseInterface;

import java.awt.peer.ChoicePeer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// TODO - Implement respective DAO interface
public class CourseService implements CourseDao {
    private final DatabaseConnection dbc;

    public CourseService(DatabaseConnection dbc) {
        this.dbc = dbc;
    }

    public CourseService() {
        this(DatabaseConnection.MANAGEMENT_SYSTEM);
    }

    @Override
    public List<CourseInterface> getAllCourses() {
        List<CourseInterface> list = new ArrayList<>();
        String sqlQuery = "SELECT * FROM course";
        try {
            ResultSet result = dbc
                    .getDatabaseConnection()
                    .prepareStatement(sqlQuery)
                    .executeQuery();
            while(result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                String instructor = result.getString("instructor");
                CourseInterface course = new Course(id, name, instructor);
                list.add(course);
            }
        } catch (SQLException e) {
            throw new Error(e);
        }
        return list;
    }

    @Override
    public List<Integer> getAllCourseIds() {
        return getAllCourses()
                .stream()
                .map(course -> course.getId())
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllCourseNames() {
        return getAllCourses()
                .stream()
                .map(course -> course.getId() + " - " + course.getName())
                .collect(Collectors.toList());
    }
}
