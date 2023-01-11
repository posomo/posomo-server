package com.posomo.project.domain.restaurant.entity;

import com.posomo.project.domain.restaurant.entity.common.OneToOne.RestaurantOneToOneSubEntity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.Getter;


@Entity
@Getter
public class RestaurantLocation extends RestaurantOneToOneSubEntity {
    @Column(length = 200)
    private String roadAddress;
    @Column()
    private BigDecimal latitude;
    @Column()
    private BigDecimal longitude;
}
