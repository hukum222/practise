package com.mapping.practise.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="student" )

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="student_name")
    private String studentName;
    @Column(name="student_age")
    private String studentAge;
    @Column(name="phoneNumber")
    private String phoneNumber;
    @Column(name="student_branch")
    private String studentBranch;
    @Column(name="student_dept")
    private String studentDepartment;

    @Embedded
    private Address studentAddress;
}

