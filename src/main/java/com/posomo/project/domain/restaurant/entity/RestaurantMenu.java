package com.posomo.project.domain.restaurant.entity;

import com.posomo.project.domain.restaurant.entity.common.ManyToOne.RestaurantManyToOneSubEntity;
import com.posomo.project.domain.restaurant.entity.common.OneToOne.RestaurantOneToOneSubEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;
import lombok.Getter;

@Entity
@Getter
public class RestaurantMenu extends RestaurantManyToOneSubEntity {
    @Column(length = 20)
    private String name;
    private Integer price;
    @Column(name = "is_main_menu")
    private Boolean isMainMenu;
    @Column(length = 300)
    private String pictureUrl;
}
