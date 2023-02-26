package com.GeeksterAssignment.Student_Management_System.controller;

import com.GeeksterAssignment.Student_Management_System.model.Laptop;
import com.GeeksterAssignment.Student_Management_System.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Laptop")
//http://localhost:8080/api/Laptop
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @PostMapping("/saveLaptop")
//    http://localhost:8080/api/Laptop/saveLaptop
    public ResponseEntity saveLaptop(@RequestBody Laptop laptop){
    return laptopService.saveLaptop(laptop);
    }
    @PutMapping("/UpdateLaptop/{laptopId}")
//    http://localhost:8080/api/Laptop/UpdateLaptop/{laptopId}
    public ResponseEntity updateLaptop(@RequestBody Laptop laptop,@PathVariable String laptopId){
        return laptopService.updateLaptop(laptop,laptopId);
    }
    @DeleteMapping("/deleteLaptop/{brand}")
//    http://localhost:8080/api/Laptop/deleteLaptop/{brand}
    public ResponseEntity deleteLaptop(@PathVariable String brand){
        return laptopService.deleteLaptop(brand);
    }
    @GetMapping("/getalllap")
//    http://localhost:8080/api/Laptop/getalllap
    public List<Laptop> getallLap(){
        return laptopService.getallLaptops();
    }
    @GetMapping("/getlaptopusingStudentname/{name}")
//    http://localhost:8080/api/Laptop/getlaptopusingStudentname/{name}
    public List<Laptop> getlaptop(@PathVariable String name){
        return laptopService.getUsingstudentName(name);
    }

}
