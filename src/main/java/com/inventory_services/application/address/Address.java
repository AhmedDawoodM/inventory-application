package com.inventory_services.application.address;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String addressName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private double lat;
    private double lng;
    private String addressLine1;
    private String addressLine2;
}
