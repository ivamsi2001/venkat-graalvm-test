package com.venkat.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private Integer id;
    private String name;
    private String email;

    public User() {
        super();
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}