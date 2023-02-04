package com.posomo.project.domain.restaurant.entity.oneToOne;

import com.posomo.project.domain.restaurant.entity.core.entity.BaseEntity;
import com.posomo.project.domain.restaurant.entity.Restaurant;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import java.math.BigDecimal;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Getter
@EntityListeners(AuditingEntityListener.class)
public class RestaurantLocation extends BaseEntity {
    @OneToOne
    @MapsId
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    private Restaurant restaurant;

    @Column(length = 200)
    private String roadAddress;
    @Column()
    private BigDecimal latitude;
    @Column()
    private BigDecimal longitude;
}
