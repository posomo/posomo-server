package com.posomo.project.domain.restaurant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class RestaurantMainMenuPriceRange {
    @Id
    @GeneratedValue
    private Long id;
    private Long restaurantId;
    @Column(columnDefinition = "integer")
    private Integer from;
    @Column(columnDefinition = "integer")
    private Integer to;
}
