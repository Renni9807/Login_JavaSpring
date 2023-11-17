package com.example.demo.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "security2")
public class User {

    @Id
    private String id;

    private String name;

    private String password;

    private String department;

    public User(String id, String name, String password, String department) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.department = department;
    }
}
