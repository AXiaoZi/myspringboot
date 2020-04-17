package com.example.myspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class User {

    private static int count = 0;

    private int id;
    private String username;
    private String password;


    public User(){
       id = count ++ ;
    }
}
