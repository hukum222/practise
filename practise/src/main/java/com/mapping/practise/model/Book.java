package com.mapping.practise.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bookId;

    @Column(name="book_title")
    private String bookTitle;
    @Column(name="book_author")
    private String bookAuthor;
    @Column(name="book_description")
    private String bookDescription;
    @Column(name="book_price")
    private String bookPrice;
    @ManyToOne
    private Student student;
}
