package com.arcade.walkingmemaid.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BaseClass {

    // I USE THIS SHIT IN EVERY ENTITY
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    // WHEN IT WAS CREATED OR MODIFIED
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

    // WHO THE FUCK DID IT
    public String createdBy;
    public String lastModifiedBy;


}
