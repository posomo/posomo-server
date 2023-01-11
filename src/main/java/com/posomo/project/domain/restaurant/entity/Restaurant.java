package com.posomo.project.domain.restaurant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;

    private Long originalId;
    @Column(columnDefinition = "varchar(20)")
    private String name;
    @Column(columnDefinition = "varchar(100)")
    private String title_image_url;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
