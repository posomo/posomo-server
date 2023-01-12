package com.posomo.project.core.entity;


import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

@Getter
public abstract class OwnEntity extends DateEntity{
    @CreatedBy
    private Long ownerId;
}
