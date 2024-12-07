package com.windev.online_course_management_system.domain.course.repository;

import java.util.Optional;
import java.util.UUID;

import com.windev.online_course_management_system.domain.course.model.Course;

public interface CourseRepository {
    Optional<Course> findById(UUID id);

    void save(Course course);
}
