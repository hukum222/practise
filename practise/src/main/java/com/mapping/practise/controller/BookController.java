package com.mapping.practise.controller;


import com.mapping.practise.model.Book;
import com.mapping.practise.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/book")
public class BookController {
    @Autowired
    private BookService bookService;

    //add
    @PostMapping("/add-book")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    //get by id
    @GetMapping("/get-book/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }


    //update
    @PutMapping("/update-book/{id}")
    public void updateBook(@PathVariable int id,@RequestBody Book newBook) {
        bookService.updateBookById(id, newBook);
    }

    //delete student by id

    @DeleteMapping("delete-book/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBookById(id);
    }

    //get all

    @GetMapping("/get-all-books")
    public List<Book> getAllBooks(){
        return bookService.getAllBook();
    }


}

