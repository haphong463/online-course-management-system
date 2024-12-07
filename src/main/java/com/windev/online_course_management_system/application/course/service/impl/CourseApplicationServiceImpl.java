package com.windev.online_course_management_system.application.course.service.impl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.windev.online_course_management_system.application.course.service.CourseApplicationService;
import com.windev.online_course_management_system.domain.course.model.Course;
import com.windev.online_course_management_system.domain.course.repository.CourseRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CourseApplicationServiceImpl implements CourseApplicationService {

    private final CourseRepository courseRepository;

    public CourseApplicationServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public UUID createCourse(String title, String description) {
        Course course = new Course(UUID.randomUUID(), title, description);
        courseRepository.save(course);
        return course.getId();
    }

    @Override
    public Optional<Course> getCourseByiD(UUID id) {
        return courseRepository.findById(id);
    }

}
