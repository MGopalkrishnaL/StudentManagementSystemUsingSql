package com.GeeksterAssignment.Student_Management_System.controller;

import com.GeeksterAssignment.Student_Management_System.DTO.StudentDTO;
import com.GeeksterAssignment.Student_Management_System.model.Student;
import com.GeeksterAssignment.Student_Management_System.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Student")
//http://localhost:8080/api/Student
public class Studentcontroller {
    @Autowired
    Studentservice studentservice;
    @PostMapping("/savestudent")
//    http://localhost:8080/api/Student/savestudent
    public ResponseEntity addStudent(@RequestBody StudentDTO student){
        return studentservice.savedetailes(student);
    }
    @GetMapping("/getAll")
//    http://localhost:8080/api/Student/getAll
    public List<Student> getall(){
        return studentservice.getalldetails();
    }
    @GetMapping("/getusingName/{name}")
//    http://localhost:8080/api/Student/getusingName/{name}
    public List<Student> getstudent(@PathVariable String name){
        return studentservice.getbyusingName(name);
    }
    @PutMapping("/updatestudent/{id}")
//    http://localhost:8080/api/Student/updatestudent/{id}
    public ResponseEntity updatestudent(@RequestBody StudentDTO student , @PathVariable String id){
        return studentservice.updateStudent(student,id);
    }
    @DeleteMapping("/deleteStudent/{id}")
//    http://localhost:8080/api/Student/deleteStudent/{id}
    public ResponseEntity delete(@PathVariable String id){
        return studentservice.deleteStudent(id);
    }

}
