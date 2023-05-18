package com.mapping.practise.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    @Column(name="course_title")
    private String courseTitle;
    @Column(name="course_description")
    private String courseDescription;
    @Column(name="course_duration")
    private String courseDuration;
    @ManyToMany
    private List<Student> studentList = new ArrayList<>();


}
