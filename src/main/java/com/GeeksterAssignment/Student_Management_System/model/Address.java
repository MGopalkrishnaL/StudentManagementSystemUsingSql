package com.GeeksterAssignment.Student_Management_System.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Column(name = "address_landmark")
    private String landmark;
    @Column(name = "address_zipcode")
    private String zipcode;
    @Column(name = "address_dis")
    private String district;
    @Column(name = "address_state")
    private String state;
    @Column(name = "address_country")
    private String country;
}
