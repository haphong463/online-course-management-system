package com.windev.online_course_management_system.application.course.service;

import java.util.Optional;
import java.util.UUID;

import com.windev.online_course_management_system.domain.course.model.Course;

public interface CourseApplicationService {
    UUID createCourse(String title, String description);

    Optional<Course> getCourseByiD(UUID id);
}
