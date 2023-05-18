package com.mapping.practise.dao;


import com.mapping.practise.model.Book;
import com.mapping.practise.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository  extends JpaRepository<Book, Integer> {
    List<Book> findAllBookByStudent(Student student);

}

