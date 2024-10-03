package com.asgard09.library.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "description")
    private String description;

    @Column(name = "copies")
    private int copies;

    @Column(name = "copies_available")
    private int copiesAvailable;
    //--> Number of copies available for loan

    @Column(name = "category")
    private String category;

    @Column(name = "img")
    private String img;
}
