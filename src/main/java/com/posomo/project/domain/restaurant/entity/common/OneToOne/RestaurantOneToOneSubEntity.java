package com.posomo.project.domain.restaurant.entity.common.OneToOne;


import com.posomo.project.core.entity.BaseEntity;
import com.posomo.project.domain.restaurant.entity.Restaurant;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@MappedSuperclass
@Getter
public abstract class RestaurantOneToOneSubEntity extends BaseEntity {
    @MapsId
    @JoinColumn(name = "id")
    @OneToOne
    private Restaurant restaurant;
}
