package com.posomo.project.domain.restaurant;

import jakarta.persistence.*;

@Entity
public class RestaurantTimeDay {
    @Id
    @GeneratedValue
    private Long id;
    private Long breakTimeId;
    @Enumerated(value = EnumType.STRING)
    private Day day;
}
