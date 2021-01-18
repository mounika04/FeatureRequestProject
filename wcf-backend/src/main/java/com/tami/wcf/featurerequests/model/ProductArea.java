package com.mouni.wcf.featurerequests.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class ProductArea {

    @Id
    @GeneratedValue
    Long productAreaId;

    @Column(name = "name")
    String name;

    public ProductArea() {}

    public ProductArea(String name) {
        this.name = name;
    }
}
