package com.example.demo.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="BOOK_TABLE")
@Getter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    private String userId;

    private String title;

    private Long price;
    protected Book(){}
    public Book(String userId, String title, Long price){
        this.userId = userId;
        this.title = title;
        this.price = price;
    }

}
