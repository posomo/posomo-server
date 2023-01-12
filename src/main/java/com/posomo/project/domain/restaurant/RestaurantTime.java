package com.posomo.project.domain.restaurant;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "restaurant_time")
@Entity
public class RestaurantTime {
    @GeneratedValue
    @Id
    @Column(columnDefinition = "UUID")
    private UUID id;
    private Long restaurantId;
    @Column(columnDefinition = "integer")
    private Integer from;
    @Column(columnDefinition = "integer")
    private Integer to;
    @Enumerated(value = EnumType.STRING)
    private RestaurantTimeType type;

}
