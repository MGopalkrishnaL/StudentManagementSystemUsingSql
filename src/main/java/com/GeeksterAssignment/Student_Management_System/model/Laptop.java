package com.GeeksterAssignment.Student_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
    @Id
    @Column(name = "lap_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID;
    @Column(name = "lap_name")
    private String name;
    @Column(name = "lap_brand")
    private String brand;
    @Column(name = "price")
    private Integer price;
    @OneToOne
    private Student student;
}
