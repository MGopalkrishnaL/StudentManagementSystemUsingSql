package com.GeeksterAssignment.Student_Management_System.service;

import com.GeeksterAssignment.Student_Management_System.DTO.StudentDTO;
import com.GeeksterAssignment.Student_Management_System.Repostiory.IStudentRepo;
import com.GeeksterAssignment.Student_Management_System.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class Studentservice {
    @Autowired
    IStudentRepo studentRepo;

    public ResponseEntity savedetailes(StudentDTO studentdto) {

        Student student = new Student();

        String ID = UUID.randomUUID().toString();
        student.setID(ID);
        student.setName(studentdto.getName());
        student.setAge(studentdto.getAge());
        student.setBranch(studentdto.getBranch());
        student.setDepartment(studentdto.getDepartment());
        student.setPhoneNumber(studentdto.getNumber());
        student.setAddress(studentdto.getAddress());
        studentRepo.save(student);
        return new ResponseEntity("Student saved successfully with id:-"+student.getID()+" and name:- "+student.getName(), HttpStatus.CREATED);
    }

    public List<Student> getalldetails() {
        return studentRepo.findAll();
    }
    public List<Student> getbyusingName(String name){
        List<Student> students= new ArrayList<>();
        List<Student> studentList =  studentRepo.findAll();
        for(Student stu : studentList){
            if((stu.getName()).equals(name)){
                students.add(stu);
            }
        }
        return students;
    }
    public ResponseEntity updateStudent(StudentDTO student, String id) {
        List<Student> studentList =  studentRepo.findAll();
        for(Student stu : studentList){
            if((stu.getID()).equals(id)){
                stu.setName(student.getName());
                stu.setBranch(student.getBranch());
                stu.setPhoneNumber(stu.getPhoneNumber());
                studentRepo.save(stu);
                return new ResponseEntity<>("Student details Updated "+stu.getName(),HttpStatus.ACCEPTED);
            }
        }
        return new ResponseEntity<>("Student with id - "+id+"Not found",HttpStatus.NOT_FOUND);
    }

    public ResponseEntity deleteStudent(String id) {
        List<Student> studentList = studentRepo.findAll();
        for(Student student :studentList){
            if((student.getID()).equals(id)){
                studentRepo.delete(student);
                return new ResponseEntity<>("Student with the id-"+id+" got deleted.",HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Student with the id not found",HttpStatus.NOT_FOUND);
    }
}
