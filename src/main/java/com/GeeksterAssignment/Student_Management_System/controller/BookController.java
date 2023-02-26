package com.GeeksterAssignment.Student_Management_System.controller;

import com.GeeksterAssignment.Student_Management_System.Repostiory.IBookRepo;
import com.GeeksterAssignment.Student_Management_System.model.Book;
import com.GeeksterAssignment.Student_Management_System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/api/book")
//http://localhost:8080/api/book
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("/getall")
//    http://localhost:8080/api/book/getall
    public List<Book> bookList(){
        return bookService.getall();
    }
    @PostMapping("/savebook")
//    http://localhost:8080/api/book/savebook
    public ResponseEntity savebook(@RequestBody Book book){
        return bookService.saveBook(book);
    }
    @GetMapping("/getstudents/{StudentName}")
//    http://localhost:8080/api/book/getstudents/{StudentName}
    public List<Book> byusingStudent(@PathVariable String StudentName){
        return bookService.usingstudent(StudentName);
    }
    @PutMapping("/updateBookdetails/{BookId}")
//    http://localhost:8080/api/book/updateBookdetails/{BookId}
    public ResponseEntity update(@RequestBody Book book,@PathVariable String BookId){
        return bookService.updateBook(book,BookId);
    }
    @DeleteMapping("/deleteBookusingBookId/{id}")
//    http://localhost:8080/api/book/deleteBookusingBookId/{id}
    public ResponseEntity delete(@PathVariable String id){
        return bookService.deleteBook(id);
    }
}
