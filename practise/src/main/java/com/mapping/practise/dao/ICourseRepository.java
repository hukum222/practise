package com.mapping.practise.dao;


import com.mapping.practise.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository  extends JpaRepository<Course, Integer> {
}
