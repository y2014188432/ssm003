package com.southwind.entity;

import lombok.Data;

@Data
public class User {
    private long id;
    private String username;
    private String password;
}