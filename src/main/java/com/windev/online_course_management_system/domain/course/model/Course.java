package com.windev.online_course_management_system.domain.course.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "courses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    private UUID id;
    private String title;
    private String description;

    public void updateDetails(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
