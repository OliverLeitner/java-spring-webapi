package com.appcall.webapi.users;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
// java defaults to thing_thing, instead of thingThing
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@DiscriminatorValue("users")
@AllArgsConstructor
@NoArgsConstructor
class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
  
    protected User() {}
}