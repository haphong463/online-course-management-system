package com.windev.online_course_management_system.infrastructure.course.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.windev.online_course_management_system.domain.course.model.Course;
import com.windev.online_course_management_system.domain.course.repository.CourseRepository;

@Repository
public class InMemoryCourseRepository implements CourseRepository {
    private final JpaCourseRepository jpaCourseRepository;

    public InMemoryCourseRepository(JpaCourseRepository jpaCourseRepository) {
        this.jpaCourseRepository = jpaCourseRepository;
    }

    @Override
    public Optional<Course> findById(UUID id) {
        return jpaCourseRepository.findById(id);
    }

    @Override
    public void save(Course course) {
        jpaCourseRepository.save(course);
    }

}
