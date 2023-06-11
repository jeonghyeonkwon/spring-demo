package com.example.demo.dto;


import lombok.Data;

@Data
public class AccountDto {
    private Long uid;
    private String userId;
    private String pwd;
    private String userName;
    private Integer age;

    public AccountDto(Long uid, String userId,String pwd, String userName, Integer age){
        this.uid = uid;
        this.userId = userId;
        this.pwd = pwd;
        this.userName = userName;
        this.age = age;
    }


}
