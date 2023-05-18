package com.mapping.practise.service;


import com.mapping.practise.dao.IStudentRepository;
import com.mapping.practise.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository studentRepo;
    public Student addStudent(Student newStudent) {
        return studentRepo.save(newStudent);
    }
    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }
    public void updateStudentById(int id, Student newStudent) {
        Student stud = studentRepo.findById(id).get();
        stud.setId(newStudent.getId());
        stud.setStudentName(newStudent.getStudentName());
        stud.setStudentAge(newStudent.getStudentAge());
        stud.setStudentBranch(newStudent.getStudentBranch());
        stud.setStudentDepartment(newStudent.getStudentDepartment());
        stud.setPhoneNumber(newStudent.getPhoneNumber());
        stud.setStudentAddress(newStudent.getStudentAddress());

        studentRepo.save(stud);
    }
    public void deleteStudentById(int id) {
        studentRepo.deleteById(id);
    }

}


