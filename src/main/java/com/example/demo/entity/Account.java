package com.example.demo.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT_TABLE")
@Getter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    private String accountId;

    private String password;

    private String name;

    private Integer age;

    protected Account(){}

    public Account(String accountId, String password, String name, Integer age){
        this.accountId = accountId;
        this.password = password;
        this.name = name;
        this.age = age;
    };


}
