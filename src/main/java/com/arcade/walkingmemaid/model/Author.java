package com.arcade.walkingmemaid.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "f_name", nullable = false)
    private String firstName;
    @Column(name = "l_name")
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private int age;

    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;
    @Column(insertable = false)
    private LocalDateTime lastModified;


    @ManyToMany
    private List<Course>  courses;
}
