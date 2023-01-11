package com.posomo.project.domain.restaurant;

import jakarta.persistence.*;

@Table(name = "restaurant_location")
@Entity
public class RestaurantLocation {
    @GeneratedValue
    @Id
    private Long id;
    private Long restaurantId;
    @Column(columnDefinition = "varchar(200)")
    private String roadAddress;
    @Column(columnDefinition = "decimal")
    private Double latitude;
    @Column(columnDefinition = "decimal")
    private Double longitude;
}
