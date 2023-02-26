package com.GeeksterAssignment.Student_Management_System.Repostiory;

import com.GeeksterAssignment.Student_Management_System.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop,Integer> {

}
