package com.posomo.project.domain.restaurant.entity.oneToOne;

import com.posomo.project.domain.restaurant.entity.core.EmbeddableRange;
import com.posomo.project.domain.restaurant.entity.core.entity.BaseEntity;
import com.posomo.project.domain.restaurant.entity.Restaurant;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Entity
@Getter
public class RestaurantMainMenuPriceRange extends BaseEntity {
    @OneToOne
    @MapsId
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    private Restaurant restaurant;
    @Embedded
    private EmbeddableRange<Integer> range;
}
