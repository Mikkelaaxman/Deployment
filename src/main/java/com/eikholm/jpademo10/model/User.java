package com.eikholm.jpademo10.model;

import javax.persistence.*;

@Entity
@Table(name = "users") // (name = "users") er krævet.
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column // (name = "first_name") er IKKE krævet
    private String userName;  // SKAL være i camel-case (firstName)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
