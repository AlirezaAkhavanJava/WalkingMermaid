package com.arcade.walkingmemaid.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Author {
    @Id
    @SequenceGenerator(name = "seq" , sequenceName = "seq_generator", allocationSize = 1)
    //@TableGenerator(name = "seq", table = "id_generator", pkColumnName = "id_name", valueColumnName = "val", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
