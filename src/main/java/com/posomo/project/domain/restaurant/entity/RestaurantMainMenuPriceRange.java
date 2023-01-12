package com.posomo.project.domain.restaurant.entity;

import com.posomo.project.core.EmbeddableRange;
import com.posomo.project.domain.restaurant.entity.common.OneToOne.RestaurantOneToOneSubEntity;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class RestaurantMainMenuPriceRange extends RestaurantOneToOneSubEntity {
    @Embedded
    private EmbeddableRange<Integer> range;
}
