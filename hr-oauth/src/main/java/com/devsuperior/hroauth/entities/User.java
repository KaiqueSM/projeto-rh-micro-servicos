package com.devsuperior.hroauth.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
public class User implements Serializable {

    private Long id;

    private String name;

    private String email;

    private String password;

    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
