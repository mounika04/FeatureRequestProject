package com.mouni.wcf.featurerequests.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long clientId;
    private String clientName;

    public Client() {}

    public Client(String clientName) {
        this.clientName = clientName;
    }

}
