package com.Spring.SpringSecurity.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name= "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name= "password", length = 70)
    private String password;

    @Column(name="role")
    private String role;

    @Column(name="enabled")
    private boolean enabled=false;
}
