package com.windev.online_course_management_system.infrastructure.course.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.windev.online_course_management_system.domain.course.model.Course;

public interface JpaCourseRepository extends JpaRepository<Course, UUID> {
    
}
