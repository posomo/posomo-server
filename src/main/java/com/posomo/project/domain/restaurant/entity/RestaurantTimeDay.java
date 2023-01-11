package com.posomo.project.domain.restaurant.entity;

import com.posomo.project.core.entity.BaseEntity;
import com.posomo.project.core.enums.Day;
import jakarta.persistence.*;

@Entity
public class RestaurantTimeDay extends BaseEntity {

    @JoinColumn(name="restaurant_break_time_id")
    @ManyToOne()
    private RestaurantTime time;
    @Enumerated(value = EnumType.STRING)
    private Day day;
}
