package com.springBoot.LearningRESTAPIs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   // FIX: should be lowercase "id"

    private String name;
    private String email;

    public void setName(String value) {
        this.name = value;
    }

    public void setEmail(String value) {
        this.email = value;
    }
}