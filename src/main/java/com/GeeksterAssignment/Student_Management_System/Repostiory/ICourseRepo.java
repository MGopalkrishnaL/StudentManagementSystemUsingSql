package com.GeeksterAssignment.Student_Management_System.Repostiory;

import com.GeeksterAssignment.Student_Management_System.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course,Integer> {
}
