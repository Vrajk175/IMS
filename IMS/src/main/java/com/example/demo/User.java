package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "users")  
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

  
    public String getName() {
        return name;
    }
}