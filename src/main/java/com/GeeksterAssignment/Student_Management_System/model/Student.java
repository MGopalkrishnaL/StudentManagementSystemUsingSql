package com.GeeksterAssignment.Student_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(name = "student_id")
    private String ID;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_age")
    private String age;
    @Column(name = "student_Number")
    private String phoneNumber;
    @Column(name = "student_branch")
    private String branch;
    @Column(name = "student_department")
    private String department;

    @Embedded
    private Address address;


}
