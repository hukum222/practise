package com.mapping.practise.service;


import com.mapping.practise.dao.IBookRepository;
import com.mapping.practise.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepo;

    //create
    public Book addBook(Book newBook) {
        return bookRepo.save(newBook);
    }
    //get by id
    public Book getBookById(int id) {
        return bookRepo.findById(id).get();
    }

    //get all
    public List<Book> getAllBook(){
        return bookRepo.findAll();
    }

    //delete
    public void deleteBookById(int id) {
        bookRepo.deleteById(id);
    }

    //update by id

    public void updateBookById(int id, Book newBook) {
        Book books = bookRepo.findById(id).get();
        books.setBookAuthor(newBook.getBookAuthor());
        books.setBookId(newBook.getBookId());
        books.setBookDescription(newBook.getBookDescription());
        books.setBookPrice(newBook.getBookPrice());
        books.setBookTitle(newBook.getBookTitle());
        books.setStudent(newBook.getStudent());

        bookRepo.save(books);


    }


}
