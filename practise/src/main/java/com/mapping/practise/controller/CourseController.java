package com.mapping.practise.controller;

import com.mapping.practise.model.Course;
import com.mapping.practise.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/add-course")
    public Course addBook(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @GetMapping("/get-course/{id}")
    public Course getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }

    @PutMapping("/update-course/{id}")
    public void updateCourse(@PathVariable int id,@RequestBody Course newCourse) {
        courseService.updateCourseById(id, newCourse);
    }

    @DeleteMapping("delete-course/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseService.deleteCourseById(id);
    }

    @GetMapping("/get-all-courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourse();
    }


}

