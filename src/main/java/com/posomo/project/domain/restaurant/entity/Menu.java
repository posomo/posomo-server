package com.posomo.project.domain.restaurant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Menu {
    @GeneratedValue
    @Id
    private Long id;
    private Long restaurant_id;
    @Column(columnDefinition = "varchar(20)")
    private String name;
    @Column(columnDefinition = "integer")
    private Integer price;
    @Column(name = "is_main_menu",columnDefinition = "boolean")
    private Boolean isMainMenu;
    @Column(name = "picture_url",columnDefinition = "varchar(300)")
    private String pictureUrl;
}
