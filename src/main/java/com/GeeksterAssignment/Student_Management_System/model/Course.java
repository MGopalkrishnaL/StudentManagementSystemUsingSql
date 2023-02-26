package com.GeeksterAssignment.Student_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID;
    @Column(name = "course_title")
    private String title;
    @Column(name = "course_desc")
    private String description;
    @Column(name = "course_duration")
    private String duration;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Student> studentList = new ArrayList<>();

}
