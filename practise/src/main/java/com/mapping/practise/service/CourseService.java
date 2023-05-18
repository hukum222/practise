package com.mapping.practise.service;


import com.mapping.practise.dao.ICourseRepository;
import com.mapping.practise.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private ICourseRepository courseRepo;


    //create
    public Course addCourse(Course newCourse) {
        return courseRepo.save(newCourse);
    }

    //get by id
    public Course getCourseById(int id) {
        return courseRepo.findById(id).get();
    }

    //get all
    public List<Course> getAllCourse(){
        return courseRepo.findAll();
    }

    //delete
    public void deleteCourseById(int id) {
        courseRepo.deleteById(id);
    }

    //update
    public void updateCourseById(int id,Course newCourse) {
        Course course = courseRepo.findById(id).get();

        course.setCourseId(newCourse.getCourseId());
        course.setCourseDescription(newCourse.getCourseDescription());
        course.setCourseDuration(newCourse.getCourseDuration());
        course.setCourseTitle(newCourse.getCourseTitle());
        course.setStudentList(newCourse.getStudentList());

        courseRepo.save(course);
    }


}