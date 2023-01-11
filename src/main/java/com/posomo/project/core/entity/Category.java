package com.posomo.project.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Category {
    @GeneratedValue
    @Id
    private Long id;
    @Column(length = 20)
    private String name;
}
