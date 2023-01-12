package com.posomo.project.domain.restaurant.entity;

import com.posomo.project.core.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class RestaurantMainMenu extends BaseEntity {
    @OneToOne
    @JoinColumn(name = "restaurant_menu_id", referencedColumnName = "uuid")
    private RestaurantMenu restaurantMenu;
}
