package com.posomo.project.domain.restaurant.entity.core.entity;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.util.UUID;
import lombok.Getter;

@MappedSuperclass
@Getter
public class BaseEntity {
    @Id
    private UUID uuid;
}
