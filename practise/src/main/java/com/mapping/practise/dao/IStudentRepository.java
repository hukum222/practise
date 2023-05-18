package com.mapping.practise.dao;


import com.mapping.practise.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {
    void deleteById(int id);

}
