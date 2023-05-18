package com.mapping.practise.controller;


import com.mapping.practise.model.Student;
import com.mapping.practise.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
    @GetMapping("/findByStudentId/{id}")
    public Student getStudentsById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
    @PutMapping("/updateStudent/{id}")
    public void updateStudent(@PathVariable int id,@RequestBody Student newStudent) {
        studentService.updateStudentById(id, newStudent);
    }

    @DeleteMapping("deleteStudent/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudentById(id);
    }

    @GetMapping("/findAllStudent")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }



}
