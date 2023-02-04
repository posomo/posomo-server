package com.posomo.project.domain.restaurant.entity.manyToOne;

import com.posomo.project.domain.restaurant.entity.core.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class RestaurantMainMenu extends BaseEntity {

    @OneToOne
    @MapsId
    @JoinColumn(name = "restaurant_menu_id", referencedColumnName = "id")
    private RestaurantMenu restaurantMenu;
}
