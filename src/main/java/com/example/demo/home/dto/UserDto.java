package com.example.demo.home.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    public String name;
    protected String name2;
    private String name3;

    public UserDto(String name, String name2, String name3){
        this.name = name;
        this.name2 = name2;
        this.name3 = name3;
    }

}
