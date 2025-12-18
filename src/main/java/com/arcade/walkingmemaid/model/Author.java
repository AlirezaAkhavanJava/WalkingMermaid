package com.arcade.walkingmemaid.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseClass{


    @Column(name = "f_name", nullable = false)
    private String firstName;
    @Column(name = "l_name")
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private int age;


    @ManyToMany(mappedBy = "authors")
    private List<Course>  courses;


}
