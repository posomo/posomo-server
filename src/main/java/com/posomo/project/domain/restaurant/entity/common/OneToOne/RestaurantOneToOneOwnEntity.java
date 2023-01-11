package com.posomo.project.domain.restaurant.entity.common.OneToOne;


import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class RestaurantOneToOneOwnEntity extends RestaurantOneToOneDateEntity {
    @CreatedBy
    private Long ownerId;
}
