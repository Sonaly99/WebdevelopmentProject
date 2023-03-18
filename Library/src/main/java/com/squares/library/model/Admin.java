package com.squares.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admin")

public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="admin Id")
    private Long id;
    private String FirstName;

    private String LastName;

    private String username;

    private String password;

    @Lob
    @Column(columnDefinition = "MEDIUMLOB")
    private String Image;
@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
@JoinTable(name="admin.roles", joinColumns =  @JoinColumn(name = "admin_id", referencedColumnName = "admin_id" ),
inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id") )
    private Collection<Role> roles;

}
