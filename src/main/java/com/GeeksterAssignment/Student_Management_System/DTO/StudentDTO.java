package com.GeeksterAssignment.Student_Management_System.DTO;

import com.GeeksterAssignment.Student_Management_System.model.Address;
import lombok.Data;

@Data
public class StudentDTO {
    private String name;
    private String age;
    private String number;
    private String branch;
    private String department;
    private Address address;
}
