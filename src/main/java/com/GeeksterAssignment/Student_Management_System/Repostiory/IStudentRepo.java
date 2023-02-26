package com.GeeksterAssignment.Student_Management_System.Repostiory;

import com.GeeksterAssignment.Student_Management_System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepo extends JpaRepository<Student,Integer> {

}
