package com.posomo.project.domain.restaurant.entity;

import com.posomo.project.core.EmbeddableRange;
import com.posomo.project.domain.restaurant.entity.common.ManyToOne.RestaurantManyToOneSubEntity;
import jakarta.persistence.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Entity
@Getter
public class RestaurantTime extends RestaurantManyToOneSubEntity {
    @Embedded
    private EmbeddableRange<LocalTime> range;

    @Enumerated(value = EnumType.STRING)
    private RestaurantTimeType type;

    @OneToMany(mappedBy = "time")
    private List<RestaurantTimeDay> days = new ArrayList<>();
}
