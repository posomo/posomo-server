package com.posomo.project.domain.restaurant.entity.common.ManyToOne;


import com.posomo.project.core.entity.BaseEntity;
import com.posomo.project.domain.restaurant.entity.Restaurant;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@MappedSuperclass
@Getter
public abstract class RestaurantManyToOneSubEntity extends BaseEntity {
    @JoinColumn(name = "restaurant_id", referencedColumnName = "uuid")
    @ManyToOne
    private Restaurant restaurant;
}
