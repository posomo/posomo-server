package com.posomo.project.domain.restaurant;

import jakarta.persistence.*;

@Table(name = "restaurant_time")
@Entity
public class RestaurantTime {
    @GeneratedValue
    @Id
    private Long id;
    private Long restaurantId;
    @Column(columnDefinition = "integer")
    private Integer from;
    @Column(columnDefinition = "integer")
    private Integer to;
    @Enumerated(value = EnumType.STRING)
    private RestaurantTimeType type;

}
