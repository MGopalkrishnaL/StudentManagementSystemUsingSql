package com.GeeksterAssignment.Student_Management_System.controller;

import com.GeeksterAssignment.Student_Management_System.model.Course;
import com.GeeksterAssignment.Student_Management_System.model.Student;
import com.GeeksterAssignment.Student_Management_System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
//http://localhost:8080/api/course
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("/getall")
//    http://localhost:8080/api/course/getall
    public List<Course> getallcourse(){
        return courseService.getcourses();
    }
    @PostMapping("/addCourse")
//    http://localhost:8080/api/course/addCourse
    public ResponseEntity addCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }
    @GetMapping("/listStudent/{coursename}")
//    http://localhost:8080/api/course/listStudent/{coursename}
    public List<Student> students(@PathVariable String coursename){
        return courseService.getstudentList(coursename);
    }
    @DeleteMapping("/deletecourse/{name}")
//    http://localhost:8080/api/course/deletecourse/{name}
public ResponseEntity delete(@PathVariable String name){
    return courseService.deleteCourse(name);
    }
    @PutMapping("/updatecourse/{coursename}")
//    http://localhost:8080/api/course/updatecourse/{coursename}
    public ResponseEntity update(@RequestBody Course course,@PathVariable String coursename){

        return courseService.UpdateCourse(course,coursename);
    }
}
