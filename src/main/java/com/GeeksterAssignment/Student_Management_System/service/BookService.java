package com.GeeksterAssignment.Student_Management_System.service;

import com.GeeksterAssignment.Student_Management_System.Repostiory.IBookRepo;
import com.GeeksterAssignment.Student_Management_System.model.Book;
import com.GeeksterAssignment.Student_Management_System.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;
    public ResponseEntity saveBook(Book book){
        bookRepo.save(book);
        return new ResponseEntity<>("Book has been Saved"+book.getID(), HttpStatus.CREATED);
    }
    public List<Book> getall(){
        return bookRepo.findAll();
    }
    public List<Book> usingstudent(String name){
        List<Book> bookList= bookRepo.findAll();
        List<Book> studentBook = new ArrayList<>();
        for(Book book: bookList){
            if(book.getStudent().getName().equals(name)){
                studentBook.add(book);
            }
        }
        return studentBook;
    }
    public ResponseEntity updateBook(Book book,String bookId){
        List<Book> bookList = bookRepo.findAll();
        for(Book book1 : bookList){
            if(book1.getID().equals(bookId)){
                book1.setTitle(book.getTitle());
                book1.setPrice(book.getPrice());
                book1.setAuthor(book.getAuthor());
                bookRepo.save(book1);
                return new ResponseEntity("Book has been Updated successfully "+ book1.getTitle(),HttpStatus.ACCEPTED);
            }
        }
        return new ResponseEntity<>("Book has been not found ",HttpStatus.NOT_FOUND);
    }
    public ResponseEntity deleteBook (String bookid){
        List<Book> bookList = bookRepo.findAll();
        for(Book book : bookList){
            if(book.getID().equals(bookid)){
                bookRepo.delete(book);
                return new ResponseEntity<>("Book has been deleted "+book.getTitle(),HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Book has been not found",HttpStatus.BAD_REQUEST);
    }
}
