package com.GeeksterAssignment.Student_Management_System.service;

import com.GeeksterAssignment.Student_Management_System.Repostiory.LaptopRepo;
import com.GeeksterAssignment.Student_Management_System.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class LaptopService {
    @Autowired
    LaptopRepo laptopRepo;

    public ResponseEntity saveLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
        return new ResponseEntity("Laptop details saved with the student "+laptop.getStudent().getName(), HttpStatus.CREATED);
    }
    public List<Laptop> getallLaptops(){
        return laptopRepo.findAll();
    }
    public List<Laptop> getUsingstudentName(String name){
        List<Laptop> laptopList = laptopRepo.findAll();
        for(Laptop laptop : laptopList){
            if((laptop.getStudent().getName()).equals(name)){
                laptopList.add(laptop);
            }
        }
        return laptopList;
    }
    public ResponseEntity updateLaptop(Laptop laptop,String laptopId){
        List<Laptop> laptopList = laptopRepo.findAll();
        for (Laptop  laptop1 : laptopList){
            if(laptop1.getID().equals(laptopId)){
                laptop1.setPrice(laptop.getPrice());
                laptop1.setName(laptop.getName());
                laptopRepo.save(laptop1);
                return new ResponseEntity<>("Laptop has been updated",HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Laptop has not found",HttpStatus.NOT_FOUND);
    }
    public ResponseEntity deleteLaptop(String brand){
        List<Laptop> laptopList = laptopRepo.findAll();
        for (Laptop  laptop1 : laptopList){
            if(laptop1.getBrand().equals(brand)){
                laptopRepo.delete(laptop1);
                }
            }
        return new ResponseEntity<>("Laptop has been deleted with the brand name "+brand,HttpStatus.OK);
        }
    }
