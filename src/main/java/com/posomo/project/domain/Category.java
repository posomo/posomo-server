package com.posomo.project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Category {
    @GeneratedValue
    @Id
    private Long id;
    @Column(columnDefinition = "varchar(20)")
    private String name;
}
