package com.windev.online_course_management_system.presentation.course;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.windev.online_course_management_system.application.course.service.CourseApplicationService;
import com.windev.online_course_management_system.domain.course.model.Course;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    private final CourseApplicationService courseApplicationService;

    public CourseController(CourseApplicationService courseApplicationService) {
        this.courseApplicationService = courseApplicationService;
    }

    @PostMapping
    public ResponseEntity<UUID> createCourse(@RequestBody Course entity) {
        UUID result = courseApplicationService.createCourse(entity.getTitle(), entity.getDescription());
        return new ResponseEntity<UUID>(result, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable UUID id) {
        
        return new ResponseEntity<>(courseApplicationService.getCourseByiD(id).get(), HttpStatus.OK);
    }

}
