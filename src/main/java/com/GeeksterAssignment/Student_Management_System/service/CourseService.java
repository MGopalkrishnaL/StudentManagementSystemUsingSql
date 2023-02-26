package com.GeeksterAssignment.Student_Management_System.service;

import com.GeeksterAssignment.Student_Management_System.Repostiory.ICourseRepo;
import com.GeeksterAssignment.Student_Management_System.model.Course;
import com.GeeksterAssignment.Student_Management_System.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;
    public ResponseEntity saveCourse(Course course){
        iCourseRepo.save(course);
        return new ResponseEntity("course has been saved "+course.getTitle(), HttpStatus.CREATED);
    }
    public List<Course> getcourses(){
        return iCourseRepo.findAll();
    }
    public List<Student> getstudentList(String coursename){
        List<Course> courseList = iCourseRepo.findAll();
        for(Course course :courseList){
            if(course.getTitle().equals(coursename)){
                return course.getStudentList();
            }
        }
        return null;
    }
    public ResponseEntity deleteCourse(String CourseName){
        List<Course> courseList = iCourseRepo.findAll();
        for(Course course:courseList){
            if(course.getTitle().equals(CourseName)){
                iCourseRepo.delete(course);
                return new ResponseEntity<>("Course has been deleted -"+CourseName,HttpStatus.ACCEPTED);
            }
        }
        return new ResponseEntity<>("Course has been not found ",HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity UpdateCourse(Course course ,String coursename){
        List<Course> courseList = iCourseRepo.findAll();
        for(Course course1 : courseList){
            if(course1.getTitle().equals(coursename)){
                course1.setDuration(course.getDuration());
                course1.setDescription(course.getDescription());
                course1.setTitle(course.getTitle());
                iCourseRepo.save(course1);
                return new ResponseEntity<>("Course has been updated successfully",HttpStatus.ACCEPTED);
            }
        }
        return new ResponseEntity<>("Course has been not found",HttpStatus.NOT_FOUND);
    }
}
