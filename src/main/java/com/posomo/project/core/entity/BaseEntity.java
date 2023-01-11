package com.posomo.project.core.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Getter;

@MappedSuperclass
@Getter
@Table(indexes = @Index(name = "uuid", columnList = "uuid"))
public abstract class BaseEntity {
    @Id @GeneratedValue
    private Long id;
    @Column(unique = true, updatable = false)
    private UUID uuid;
}
